package sk.sepa.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sk.sepa.object.banka.Banka;
import sk.sepa.object.grupaNaloga.GrupaNaloga;
import sk.sepa.object.naknada.Naknada;
import sk.sepa.object.naknada.NaknadaDto;
import sk.sepa.object.nalog.*;
import sk.sepa.object.racun.Racun;
import sk.sepa.object.unos.RacunInfo;
import sk.sepa.object.unos.RacunInfoDto;
import sk.sepa.object.vrstaNamjene.VrstaNamjene;
import sk.sepa.object.vrstaOpisaPlacanja.VrstaOpisaPlacanja;
import sk.sepa.service.*;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/api")
public class UnosNalogaController {
    @Autowired
    private RacunService racunService;
    @Autowired
    private VrstaNamjeneService vrstaNamjeneService;
    @Autowired
    private VrstaOpisaPlacanjaService vrstaOpisaPlacanjaService;

    @Autowired
    private BankaService bankaService;
    @Autowired
    private NalogService nalogService;

    @Autowired
    private GrupaNalogaService grupaNalogaService;

    @PostMapping("/getRacunInfo")
    public RacunInfo getRacunInfo(@RequestBody RacunInfoDto racunInfoDto){
        Racun racun = racunService.getRacunInfoByBrojRac(racunInfoDto.getDrzava(), racunInfoDto.getKontrolniBroj(), racunInfoDto.getIban());
        if (racun==null){
            return null;
        }
        RacunInfo racunInfo = new RacunInfo();

        racunInfo.setIme(racun.getIme_rac());
        racunInfo.setAdresa(racun.getAdresa_rac());
        racunInfo.setMjesto(racun.getMjesto_rac());

        return racunInfo;
    }

    @GetMapping("/getSifNamjene")
    public List<VrstaNamjene> getSifNamjene() {
        List<VrstaNamjene> vrstaNamjene = vrstaNamjeneService.getSifNamjene();
        if (vrstaNamjene.isEmpty()) {
            // Return a 404 Not Found response if the list is empty
            return null;
        }

        // Return a 200 OK response with the list of VrstaNamjene objects
        return vrstaNamjene;
    }

    @GetMapping("/getSifOpisPlacanja")
    public ResponseEntity<List<VrstaOpisaPlacanja>> getSifOpisPlacanja() {
        List<VrstaOpisaPlacanja> vrstaOpisaPlacanja = vrstaOpisaPlacanjaService.getSifOpisPlacanja();
        if (vrstaOpisaPlacanja.isEmpty()) {
            // Return a 404 Not Found response if the list is empty
            return ResponseEntity.notFound().build();
        }

        // Return a 200 OK response with the list of VrstaNamjene objects
        return ResponseEntity.ok(vrstaOpisaPlacanja);
    }

    @PostMapping("/getNaknada")
    public Naknada getNaknada(@RequestBody NaknadaDto naknadaDto){
        Banka banka = bankaService.getBankaByVbdi(naknadaDto.getIbanRac());

        if(banka==null){
            return null;
        }

        Naknada naknada = new Naknada();
        naknada.setVrstaNaknade(banka.getVrsta_naknade());
        naknada.setIznosNaknade(banka.getIznos_naknade());

        return naknada;
    }

    @PostMapping("/insertNalog")
    public GrupaNaloga insertNalog(@RequestBody NalogDtoAndUserIdRequest request) {
        try {
            NalogDto nalogDto = request.getNalogDto();
            Long userId = request.getUserId();
            Boolean isUplata = request.getUplata();
            Boolean isIsplata = request.getIsplata();
            GrupaNaloga grupaNaloga = request.getGrupaNaloga();

            if(grupaNaloga == null){
                grupaNaloga = new GrupaNaloga();
                grupaNaloga.setId_user(userId);
                grupaNaloga.setDate(getCurrentDate());
                grupaNaloga.setSts_grupe("Aktivan");

                grupaNalogaService.insertGrupaNaloga(grupaNaloga);
            }


            Nalog newNalog = new Nalog();
            Banka banka = new Banka();

            if(isUplata){
                banka = bankaService.getBankaByVbdi(nalogDto.getIbanPlat());
                newNalog.setTip_naloga("Uplata");

            }else if(isIsplata){
                banka = bankaService.getBankaByVbdi(nalogDto.getIbanPrim());
                newNalog.setTip_naloga("Isplata");
            }



            newNalog.setId_grupe_naloga(grupaNaloga.getId());
            newNalog.setId_user(userId);
            newNalog.setId_banke(banka.getId());

            newNalog.setIznos(new BigDecimal(nalogDto.getIznos()));
            newNalog.setIme_plat(nalogDto.getImePlat());
            newNalog.setAdresa_plat(nalogDto.getAdresaPlat());
            newNalog.setMjesto_plat(nalogDto.getMjestoPlat());
            newNalog.setIme_prim(nalogDto.getImePrim());
            newNalog.setAdresa_prim(nalogDto.getAdresaPrim());
            newNalog.setMjesto_prim(nalogDto.getMjestoPrim());
            newNalog.setSif_opis_plac(nalogDto.getSifOpisPlac());
            newNalog.setSif_namjene(nalogDto.getSifNamjene());
            newNalog.setDat_izvrsenja(nalogDto.getDatIzvrsenja());
            newNalog.setDat_podnosenja(nalogDto.getDatPodnosenja());
            newNalog.setDrzava_plat(nalogDto.getDrzavaRac());
            newNalog.setKontrolni_broj_plat(nalogDto.getKontrolniBrojPlat());
            newNalog.setIban_plat(nalogDto.getIbanPlat());
            newNalog.setModel_plat(nalogDto.getModelPlat());
            newNalog.setPnb_plat(nalogDto.getPnbPlat());
            newNalog.setDrzava_prim(nalogDto.getDrzavaRac());
            newNalog.setKontrolni_broj_prim(nalogDto.getKontrolniBrojPrim());
            newNalog.setIban_prim(nalogDto.getIbanPrim());
            newNalog.setModel_prim(nalogDto.getModelPrim());
            newNalog.setPnb_prim(nalogDto.getPnbPrim());
            newNalog.setOpis_plac(nalogDto.getOpisPlac());
            newNalog.setBr_blagajne(nalogDto.getBrBlagajne());
            newNalog.setVr_naknade(nalogDto.getVrNaknade());
            newNalog.setIznos_naknade(nalogDto.getIznosNaknade());
            newNalog.setValuta_placanja("EUR");
            newNalog.setSts_naloga("Aktivan");

            nalogService.insertNalog(newNalog);

            return grupaNaloga;
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping("/getNalogList")
    public List<NalogRedux> nalogReduxList(@RequestBody NalogReduxDto nalogReduxDto){
        Long uid = nalogReduxDto.getUserId();
        Long idGrupeNaloga = nalogReduxDto.getIdGrupeNaloga();

        List<NalogRedux> nalogReduxList = new ArrayList<>();
        List<Nalog> nalogList = nalogService.getNalogListByUserIdAndGrupaNaloga(uid,idGrupeNaloga);

        for(Nalog nalog: nalogList){
            NalogRedux nalogRedux = new NalogRedux();

            nalogRedux.setId(nalog.getId());
            nalogRedux.setBrRac(nalog.getDrzava_prim()+nalog.getKontrolni_broj_prim()+nalog.getIban_prim());
            nalogRedux.setIznUpl(nalog.getIznos());
            nalogRedux.setIznIspl(new BigDecimal(0));
            nalogRedux.setDate(getCurrentDate());
            nalogRedux.setPnb(nalog.getPnb_prim());
            nalogRedux.setNaknada(new BigDecimal(0));
            nalogRedux.setSifOpisPlac(nalog.getSif_opis_plac());
            nalogRedux.setSifNamjene(nalog.getSif_namjene());
            nalogRedux.setStatus(nalog.getSts_naloga());

            nalogReduxList.add(nalogRedux);
        }

        return nalogReduxList;
    }

    @GetMapping("/current-date")
    public String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }
}
