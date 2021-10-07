package com.nivelacion.nivelacion.controllers;

import com.nivelacion.nivelacion.models.Users;
import com.nivelacion.nivelacion.respositories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;

        Users newUser01 = new Users("001", "Director", "activo", 45);
        Users newUser02 = new Users("002", "Estudiante", "activo", 23);

        this.userRepository.save(newUser01);
        this.userRepository.save(newUser02);
    }

    @GetMapping("/users/{userId}")
    Optional<Users> getUsers(@PathVariable String userId){
        return userRepository.findById(userId);
    }

}
