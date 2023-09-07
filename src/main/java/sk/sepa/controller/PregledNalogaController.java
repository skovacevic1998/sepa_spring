package sk.sepa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.sepa.object.grupaNaloga.GrupaNaloga;
import sk.sepa.object.nalog.Nalog;
import sk.sepa.object.pregled.GrNal;
import sk.sepa.object.pregled.PregledNaloga;
import sk.sepa.object.pregled.PregledNalogaDto;
import sk.sepa.service.GrupaNalogaService;
import sk.sepa.service.NalogService;
import sk.sepa.service.UserService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PregledNalogaController {
    @Autowired
    GrupaNalogaService grupaNalogaService;
    @Autowired
    UserService userService;
    @Autowired
    NalogService nalogService;

    @PostMapping("/getPregledNalogaList")
    public List<PregledNaloga> getPregledNalogaList(@RequestBody PregledNalogaDto pregledNalogaDto){
        String username = pregledNalogaDto.getUsername();
        Long userId = userService.getIdByUsername(username);

        if(userId==null){
            return null;
        }

        List<GrupaNaloga> grupaNalogaList = grupaNalogaService.getGrupaByUserId(userId);
        List<PregledNaloga> pregledNalogaList = new ArrayList<>();

        for(GrupaNaloga grupaNaloga: grupaNalogaList){
            PregledNaloga pregledNaloga = new PregledNaloga();
            List<Nalog> nalogList = nalogService.getNalogListByUserIdAndGrupaNaloga(grupaNaloga.getId_user(), grupaNaloga.getId());

            List<GrNal> grNalList = new ArrayList<>();

            String tipNaloga = "";

            for(Nalog nalog: nalogList){
                GrNal grNal = new GrNal();
                String racPrim = nalog.getDrzava_prim()+nalog.getKontrolni_broj_prim()+nalog.getIban_prim();
                String racPlat = nalog.getDrzava_plat()+nalog.getKontrolni_broj_plat()+nalog.getIban_plat();
                String infoRacPrim = nalog.getIme_prim()+ ", " +nalog.getAdresa_prim() + ", "+ nalog.getMjesto_prim();
                String infoRacPlat = nalog.getIme_plat()+ ", " +nalog.getAdresa_plat() + ", "+ nalog.getMjesto_plat();

                grNal.setRacPrim(racPrim);
                grNal.setInfoRacPrim(infoRacPrim);
                grNal.setRacPlat(racPlat);
                grNal.setInfoRacPlat(infoRacPlat);
                grNal.setSifOpisPlac(nalog.getSif_opis_plac());
                grNal.setOpisPlac(nalog.getOpis_plac());
                grNal.setSifNamjene(nalog.getSif_namjene());
                grNal.setIznosNal(nalog.getIznos());
                grNal.setIznosNaknade(nalog.getIznos_naknade());
                grNal.setStsNaloga(nalog.getSts_naloga());

                if("".equals(tipNaloga)){
                    tipNaloga = nalog.getTip_naloga();
                }

                grNalList.add(grNal);
            }

            pregledNaloga.setIdGrNal(grupaNaloga.getId());
            pregledNaloga.setTip(tipNaloga);
            pregledNaloga.setDatum(grupaNaloga.getDate());
            pregledNaloga.setStsGrupe(grupaNaloga.getSts_grupe());
            pregledNaloga.setGrNal(grNalList);

            pregledNalogaList.add(pregledNaloga);
        }

        return pregledNalogaList;
    }
}
