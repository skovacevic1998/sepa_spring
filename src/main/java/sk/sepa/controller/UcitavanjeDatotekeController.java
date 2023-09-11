package sk.sepa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.xml.sax.SAXException;
import sk.sepa.object.banka.Banka;
import sk.sepa.object.grupaNaloga.GrupaNaloga;
import sk.sepa.object.nalog.Nalog;
import sk.sepa.schema.generated.CreditTransferTransactionInformation10;
import sk.sepa.schema.generated.Document; // Import your JAXB-generated Document class
import sk.sepa.schema.generated.PaymentInstructionInformation3;
import sk.sepa.service.BankaService;
import sk.sepa.service.GrupaNalogaService;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

@RestController
@RequestMapping("/api")
public class UcitavanjeDatotekeController {
    @Autowired
    private GrupaNalogaService grupaNalogaService;

    @Autowired
    private BankaService bankaService;

    @PostMapping("/sepaValidation")
    public ResponseEntity<?> validateXml(@RequestParam("file") MultipartFile file,
                                         @RequestParam("userId") Long userId,
                                         @RequestParam("brBlagajne") int brBlagajne) {
        try {

            Long uid= userId;
            String xsdFilePath = "C:/Users/sinis/Desktop/sepa_spring/src/main/java/sk/sepa/schema/pain.001.001.03.xsd";

            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = schemaFactory.newSchema(new File(xsdFilePath));

            Validator validator = schema.newValidator();

            try (InputStream xmlInputStream = file.getInputStream()) {
                validator.validate(new StreamSource(xmlInputStream));
            }

            String xmlString = convertInputStreamToString(file.getInputStream());
            JAXBContext context = JAXBContext.newInstance(Document.class.getPackage().getName());
            Unmarshaller unmarshaller = context.createUnmarshaller();
            JAXBElement<Document> documentElement = (JAXBElement<Document>) unmarshaller.unmarshal(new StringReader(xmlString));

            Document document = documentElement.getValue();

            GrupaNaloga grupaNaloga = new GrupaNaloga();
            grupaNaloga.setId_user(userId);
            grupaNaloga.setDate(getCurrentDate());
            grupaNaloga.setSts_grupe("Aktivan");

            grupaNalogaService.insertGrupaNaloga(grupaNaloga);

            for(PaymentInstructionInformation3 pmtInf: document.getCstmrCdtTrfInitn().getPmtInf()){
                Nalog nalog = new Nalog();
                Banka banka = new Banka();

                nalog.setTip_naloga("Datoteka");
                nalog.setIme_plat(pmtInf.getDbtr().getNm());


                if(pmtInf.getDbtr().getPstlAdr() != null){
                    for(String adrline: pmtInf.getDbtr().getPstlAdr().getAdrLine()){
                        nalog.setAdresa_plat(adrline);
                    }
                    nalog.setMjesto_plat(pmtInf.getDbtr().getPstlAdr().getCtry());
                }else{
                    nalog.setAdresa_plat("");
                    nalog.setMjesto_plat("");
                }

                for(CreditTransferTransactionInformation10 cdtTrfTxInf: pmtInf.getCdtTrfTxInf()){
                    nalog.setValuta_placanja(cdtTrfTxInf.getAmt().getInstdAmt().getCcy());
                    nalog.setIznos(cdtTrfTxInf.getAmt().getInstdAmt().getValue());
                    nalog.setIme_prim(cdtTrfTxInf.getCdtr().getNm());

                    if(cdtTrfTxInf.getCdtr().getPstlAdr() != null){
                        for(String adrline: cdtTrfTxInf.getCdtr().getPstlAdr().getAdrLine())
                        {
                            nalog.setAdresa_prim(adrline);
                        }
                        nalog.setMjesto_prim(cdtTrfTxInf.getCdtr().getPstlAdr().getCtry());
                    }else{
                        nalog.setAdresa_prim("");
                        nalog.setMjesto_prim("");
                    }

                    nalog.setSif_opis_plac(99);
                    if(cdtTrfTxInf.getPurp()!=null){
                        nalog.setSif_namjene(cdtTrfTxInf.getPurp().getCd());
                    }else{
                        nalog.setSif_namjene("");
                    }

                    String drzavaPrim = cdtTrfTxInf.getCdtrAcct().getId().getIBAN().substring(0,2);
                    String kontrBrPrim = cdtTrfTxInf.getCdtrAcct().getId().getIBAN().substring(2,4);
                    String pnbPrim = cdtTrfTxInf.getCdtrAcct().getId().getIBAN().substring(4);

                    nalog.setDrzava_prim(drzavaPrim);
                    nalog.setKontrolni_broj_prim(kontrBrPrim);
                    nalog.setPnb_prim(pnbPrim);

                    if("HR".equals(drzavaPrim)){
                        banka = bankaService.getBankaByVbdi(pnbPrim);
                    }else{
                        banka = null;
                    }

                    if(banka!=null){
                        nalog.setId_banke(banka.getId());
                    }

                    nalog.setModel_prim("99");
                    nalog.setPnb_prim("");

                    if(cdtTrfTxInf.getRmtInf().getUstrd()!=null){
                        for(String opisPlac: cdtTrfTxInf.getRmtInf().getUstrd()){
                            nalog.setOpis_plac(opisPlac);
                        }
                    }else{
                        nalog.setOpis_plac("");
                    }

                }

                GregorianCalendar gregorianCalendar = pmtInf.getReqdExctnDt().toGregorianCalendar();
                nalog.setDat_izvrsenja(gregorianCalendar.getTime());
                nalog.setDat_podnosenja(gregorianCalendar.getTime());

                String drzavaPlat = pmtInf.getDbtrAcct().getId().getIBAN().substring(0,2);
                String kontrBrPlat = pmtInf.getDbtrAcct().getId().getIBAN().substring(2,4);
                String ibanPlat = pmtInf.getDbtrAcct().getId().getIBAN().substring(4);

                nalog.setDrzava_plat(drzavaPlat);
                nalog.setKontrolni_broj_plat(kontrBrPlat);
                nalog.setIban_plat(ibanPlat);

                nalog.setModel_plat("99");
                nalog.setPnb_plat("");

                nalog.setBr_blagajne(brBlagajne);
                nalog.setId_grupe_naloga(grupaNaloga.getId());
                nalog.setId_user(uid);

            }


            return ResponseEntity.ok("XML is valid according to the schema: " + grupaNaloga);
        } catch (SAXException e) {
            // Validation failed
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("XML validation failed: " + e.getMessage());
        } catch (IOException e) {
            // File I/O error
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to process XML: " + e.getMessage());
        } catch (JAXBException e) {
            // JAXB unmarshalling error
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to unmarshal XML: " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private String convertInputStreamToString(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        }
        return sb.toString();
    }

    @Autowired
    @GetMapping("/current-date1")
    public String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }
}
