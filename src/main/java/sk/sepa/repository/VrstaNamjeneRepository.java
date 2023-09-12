package sk.sepa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sk.sepa.object.vrstaNamjene.VrstaNamjene;

import java.util.List;

public interface VrstaNamjeneRepository extends JpaRepository<VrstaNamjene, Long> {
    @Query("SELECT v FROM VrstaNamjene v")
    List<VrstaNamjene> getSifNamjene();
}

