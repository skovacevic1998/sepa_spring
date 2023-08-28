package sk.sepa.service;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.sepa.object.user.User;
import sk.sepa.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private final UserRepository userRepository;
	
	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public User getAuthUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	public User updateUser(String email, User updatedUser) {
		User existingUser = userRepository.findByEmail(email);

		existingUser.setIme(updatedUser.getIme());
		existingUser.setPrezime(updatedUser.getPrezime());
		existingUser.setDob(updatedUser.getDob());
		existingUser.setLokacija(updatedUser.getLokacija());

		return userRepository.save(existingUser);
	}
}
