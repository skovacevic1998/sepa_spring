package sk.sepa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.sepa.object.konsignacija.KonsignacijaDto;
import sk.sepa.repository.GrupaNalogaRepository;
import sk.sepa.repository.NalogRepository;

@RestController
@RequestMapping("/api")
public class KonsignacijaController {
    private final GrupaNalogaRepository grupaNalogaRepository;
    private final NalogRepository nalogRepository;

    @Autowired
    public KonsignacijaController(GrupaNalogaRepository grupaNalogaRepository, NalogRepository nalogRepository) {
        this.grupaNalogaRepository = grupaNalogaRepository;
        this.nalogRepository = nalogRepository;
    }

    @PostMapping("/updateStatus")
    public ResponseEntity<?> updateStatus(@RequestBody KonsignacijaDto konsignacijaDto) {
        Long idGrupe = konsignacijaDto.getId();
        String newStatus = konsignacijaDto.getStatusGrupeNaloga();

        grupaNalogaRepository.updateStatusByGrupeNalogaId(idGrupe, newStatus);

        nalogRepository.updateStatusByGrupeNalogaId(idGrupe, newStatus);

        return ResponseEntity.ok(newStatus);
    }
}
