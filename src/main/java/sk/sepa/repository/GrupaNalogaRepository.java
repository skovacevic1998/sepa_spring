package sk.sepa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.sepa.object.grupaNaloga.GrupaNaloga;

public interface GrupaNalogaRepository extends JpaRepository<GrupaNaloga, Long> {
}
