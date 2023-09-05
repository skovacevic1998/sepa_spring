package sk.sepa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.sepa.object.banka.Banka;
import sk.sepa.repository.BankaRepository;

@Service
public class BankaService {
    @Autowired
    private final BankaRepository bankaRepository;
    @Autowired
    public BankaService(BankaRepository bankaRepository){
        this.bankaRepository=bankaRepository;
    }

    public Banka getBankaByVbdi(String ibanRac){
        String vbdiRac = ibanRac.substring(0,7);
        return bankaRepository.findByVbdi(vbdiRac);
    }
}
