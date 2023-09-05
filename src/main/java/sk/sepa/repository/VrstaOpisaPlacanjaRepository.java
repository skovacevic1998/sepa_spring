package sk.sepa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sk.sepa.object.vrstaOpisaPlacanja.VrstaOpisaPlacanja;

import java.util.List;

public interface VrstaOpisaPlacanjaRepository extends JpaRepository<VrstaOpisaPlacanja, Long> {
    @Query("SELECT o FROM VrstaOpisaPlacanja o")
    List<VrstaOpisaPlacanja> getSifOpisPlacanja();
}
