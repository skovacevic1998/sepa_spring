package sk.sepa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sk.sepa.object.racun.Racun;

public interface RacunRepository extends JpaRepository<Racun, Long> {
    @Query("SELECT r FROM Racun r WHERE r.drzava_rac = :drzava AND r.kontrolni_broj_rac = :kontrolni_broj AND r.iban_rac = :iban")
    Racun findByBrojRac(String drzava, String kontrolni_broj, String iban);
}

