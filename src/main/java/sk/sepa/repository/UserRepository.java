package sk.sepa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sk.sepa.object.user.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
	@Query("SELECT u.id FROM User u WHERE u.username = :username")
	Long getIdByUsername(@Param("username") String username);
}
