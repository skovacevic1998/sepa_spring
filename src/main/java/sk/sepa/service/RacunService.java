package sk.sepa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.sepa.object.racun.Racun;
import sk.sepa.repository.RacunRepository;

@Service
public class RacunService {
    @Autowired
    private final RacunRepository racunRepository;
    @Autowired
    public RacunService(RacunRepository racunRepository){
        this.racunRepository = racunRepository;
    }

    public Racun getRacunInfoByBrojRac(String drzava, String kontrolni_broj, String iban){
        return racunRepository.findByBrojRac(drzava, kontrolni_broj, iban);
    }
}
