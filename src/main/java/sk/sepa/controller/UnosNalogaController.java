package sk.sepa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sk.sepa.object.banka.Banka;
import sk.sepa.object.naknada.Naknada;
import sk.sepa.object.naknada.NaknadaDto;
import sk.sepa.object.nalog.Nalog;
import sk.sepa.object.nalog.NalogDto;
import sk.sepa.object.racun.Racun;
import sk.sepa.object.unos.RacunInfo;
import sk.sepa.object.unos.RacunInfoDto;
import sk.sepa.object.vrstaNamjene.VrstaNamjene;
import sk.sepa.object.vrstaOpisaPlacanja.VrstaOpisaPlacanja;
import sk.sepa.service.*;

import java.math.BigDecimal;
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
    public ResponseEntity<Nalog> insertNalog(@RequestBody NalogDto nalogDto, Long userId) {
        try {
            Nalog newNalog = new Nalog();

            newNalog.setId_grupe_naloga(null);
            newNalog.setId_user(userId);
            newNalog.setId_banke(null);

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

            Nalog savedNalog = nalogService.insertNalog(newNalog);

            return ResponseEntity.status(HttpStatus.CREATED).body(savedNalog);
        } catch (Exception e) {
            // Handle any exceptions or validation errors here
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }
}
