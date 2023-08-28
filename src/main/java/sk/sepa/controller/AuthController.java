package sk.sepa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import sk.sepa.object.user.UpdateUserRequest;
import sk.sepa.object.user.User;
import sk.sepa.object.user.UserDto;
import sk.sepa.service.UserService;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public User loginUser(@RequestBody UserDto userDTO) {
        User user = userService.getAuthUserByEmail(userDTO.getEmail());

        if (user != null &&new BCryptPasswordEncoder().matches(userDTO.getPassword(), user.getPassword())) {
            return user;
        } else {
            return null;
        }
    }

    @PutMapping("/updateUser")
    public ResponseEntity<User> updateUser(@RequestBody UpdateUserRequest updateUserRequest) {
        String email = updateUserRequest.getEmail();
        User updatedUserData = updateUserRequest.getUpdatedUserData();

        // Call the service to update the user
        User updatedUser = userService.updateUser(email, updatedUserData);

        return ResponseEntity.ok(updatedUser);
    }

    private boolean passwordMatches(String providedPassword, String storedPasswordHash) {
        return providedPassword.equals(storedPasswordHash);
    }
}



