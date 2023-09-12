package sk.sepa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.sepa.object.vrstaNamjene.VrstaNamjene;
import sk.sepa.repository.VrstaNamjeneRepository;

import java.util.List;

@Service
public class VrstaNamjeneService {
    private final VrstaNamjeneRepository vrstaNamjeneRepository;

    @Autowired
    public VrstaNamjeneService(VrstaNamjeneRepository vrstaNamjeneRepository) {
        this.vrstaNamjeneRepository = vrstaNamjeneRepository;
    }

    public List<VrstaNamjene> getSifNamjene() {
        return vrstaNamjeneRepository.getSifNamjene(); // Return null if not found
    }
}

