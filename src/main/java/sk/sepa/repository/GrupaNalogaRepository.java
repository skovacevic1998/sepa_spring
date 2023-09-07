package sk.sepa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sk.sepa.object.grupaNaloga.GrupaNaloga;

import java.util.List;

public interface GrupaNalogaRepository extends JpaRepository<GrupaNaloga, Long> {
    @Query(value = "SELECT * FROM sepa_dev.grupa_naloga WHERE id_user = :userId", nativeQuery = true)
    List<GrupaNaloga> getGrupaNalogaByUserId(@Param("userId") Long userId);
}
