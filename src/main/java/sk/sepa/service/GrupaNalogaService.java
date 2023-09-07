package sk.sepa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.sepa.object.grupaNaloga.GrupaNaloga;
import sk.sepa.repository.GrupaNalogaRepository;

import java.util.List;

@Service
public class GrupaNalogaService {
    @Autowired
    private final GrupaNalogaRepository grupaNalogaRepository;

    @Autowired
    public GrupaNalogaService(GrupaNalogaRepository grupaNalogaRepository){
        this.grupaNalogaRepository = grupaNalogaRepository;
    }

    public GrupaNaloga insertGrupaNaloga(GrupaNaloga grupaNaloga){
        return grupaNalogaRepository.save(grupaNaloga);
    }
    public List<GrupaNaloga> getGrupaByUserId(Long userId){
        return grupaNalogaRepository.getGrupaNalogaByUserId(userId);
    }
}
