package sk.sepa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.sepa.object.nalog.Nalog;
import sk.sepa.object.nalog.NalogDto;
import sk.sepa.repository.NalogRepository;

import java.util.List;

@Service
public class NalogService {
    @Autowired
    private final NalogRepository nalogRepository;
    @Autowired
    public NalogService(NalogRepository nalogRepository){
        this.nalogRepository= nalogRepository;
    }

    public Nalog insertNalog(Nalog nalog){
        return nalogRepository.save(nalog);
    }
    public List<Nalog> getNalogListByUserIdAndGrupaNaloga(Long userId, Long idGrupeNaloga){
        return nalogRepository.getNalogListByUserIdAndGrupaNaloga(userId, idGrupeNaloga);
    }
}
