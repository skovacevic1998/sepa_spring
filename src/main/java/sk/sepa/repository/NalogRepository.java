package sk.sepa.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import sk.sepa.object.nalog.Nalog;

import java.util.List;

public interface NalogRepository extends JpaRepository<Nalog, Long> {
    Nalog save(Nalog nalog);
    @Query("SELECT n FROM Nalog n WHERE n.id_user = :userId AND n.id_grupe_naloga = :idGrupeNaloga")
    List<Nalog> getNalogListByUserIdAndGrupaNaloga(Long userId, Long idGrupeNaloga);

    @Modifying
    @Transactional
    @Query("UPDATE Nalog n SET n.sts_naloga = :newStatus WHERE n.id_grupe_naloga = :idGrupeNaloga")
    void updateStatusByGrupeNalogaId(Long idGrupeNaloga, String newStatus);

}
