package sk.sepa.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sk.sepa.object.grupaNaloga.GrupaNaloga;

import java.util.List;

public interface GrupaNalogaRepository extends JpaRepository<GrupaNaloga, Long> {
    @Query(value = "SELECT * FROM sepa_dev.grupa_naloga WHERE id_user = :userId", nativeQuery = true)
    List<GrupaNaloga> getGrupaNalogaByUserId(@Param("userId") Long userId);

    @Modifying
    @Transactional
    @Query("UPDATE GrupaNaloga g SET g.sts_grupe = :newStatus WHERE g.id = :idGrupeNaloga")
    void updateStatusByGrupeNalogaId(@Param("idGrupeNaloga") Long idGrupeNaloga, @Param("newStatus") String newStatus);

}
