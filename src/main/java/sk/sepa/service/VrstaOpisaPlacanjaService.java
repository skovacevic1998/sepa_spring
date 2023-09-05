package sk.sepa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.sepa.object.vrstaOpisaPlacanja.VrstaOpisaPlacanja;
import sk.sepa.repository.VrstaOpisaPlacanjaRepository;

import java.util.List;

@Service
public class VrstaOpisaPlacanjaService {
    private final VrstaOpisaPlacanjaRepository vrstaOpisaPlacanjaRepository;

    @Autowired
    public VrstaOpisaPlacanjaService(VrstaOpisaPlacanjaRepository vrstaOpisaPlacanjaRepository){
        this.vrstaOpisaPlacanjaRepository=vrstaOpisaPlacanjaRepository;
    }

    public List<VrstaOpisaPlacanja> getSifOpisPlacanja(){
      List<VrstaOpisaPlacanja> vrstaOpisaPlacanjasList = vrstaOpisaPlacanjaRepository.getSifOpisPlacanja();
      return vrstaOpisaPlacanjasList;
    }
}
