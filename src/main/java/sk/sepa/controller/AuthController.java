package sk.sepa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import sk.sepa.object.user.InsertUserRequest;
import sk.sepa.object.user.UpdateUserRequest;
import sk.sepa.object.user.User;
import sk.sepa.object.user.UserDto;
import sk.sepa.repository.UserRepository;
import sk.sepa.service.UserService;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public User loginUser(@RequestBody UserDto userDTO) {
        User user = userService.getAuthUserByEmail(userDTO.getEmail());

        if (user != null &&new BCryptPasswordEncoder().matches(userDTO.getPassword(), user.getPassword())) {
            return user;
        } else {
            return null;
        }
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody InsertUserRequest insertUserRequest){
        User userDb = userRepository.findByEmail(insertUserRequest.getEmailRegister());

        if (userDb != null && userDb.getEmail().equals(insertUserRequest.getEmailRegister())) {
            return ResponseEntity.badRequest().body("Email already exists");
        }

        if(!insertUserRequest.getPasswordRegister().equals(insertUserRequest.getRePasswordRegister())){
            return ResponseEntity.badRequest().body("Password don't match");
        }

        User newUser = new User();

        newUser.setIme(insertUserRequest.getImeRegister());
        newUser.setPrezime(insertUserRequest.getPrezimeRegister());
        newUser.setEmail(insertUserRequest.getEmailRegister());
        newUser.setPassword(new BCryptPasswordEncoder().encode(insertUserRequest.getPasswordRegister()));
        newUser.setDob(0);
        newUser.setLokacija(insertUserRequest.getLokacijaRegister());
        newUser.setUsername(insertUserRequest.getUsernameRegister());
        newUser.setRoles("Guest");
        newUser.setBrBlagajne(0);

        userRepository.save(newUser);
        return ResponseEntity.ok(newUser);
    }

    @PutMapping("/updateUser")
    public ResponseEntity<User> updateUser(@RequestBody UpdateUserRequest updateUserRequest) {
        String email = updateUserRequest.getEmail();
        User updatedUserData = updateUserRequest.getUpdatedUserData();

        // Call the service to update the user
        User updatedUser = userService.updateUser(email, updatedUserData);

        return ResponseEntity.ok(updatedUser);
    }

    @GetMapping("/checkUsername")
    public ResponseEntity<Boolean> checkUsernameExists(@RequestParam("username") String username) {
        User user = userRepository.findByUsername(username);
        boolean usernameExists = user != null;
        return ResponseEntity.ok(usernameExists);
    }
}



