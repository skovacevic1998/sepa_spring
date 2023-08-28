package sk.sepa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.sepa.object.user.User;

public interface UserRepository extends JpaRepository<User, Long> {
		User findByEmail(String email);
}
