package sk.sepa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sk.sepa.object.banka.Banka;

public interface BankaRepository extends JpaRepository<Banka, Long> {
    @Query("SELECT b FROM Banka b WHERE vbdi_banke = :vbdiRac")
    Banka findByVbdi(String vbdiRac);
}
