package sk.sepa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sk.sepa.object.nalog.Nalog;
import sk.sepa.object.nalog.NalogDto;

public interface NalogRepository extends JpaRepository<Nalog, Long> {
    Nalog save(Nalog nalog);
}
