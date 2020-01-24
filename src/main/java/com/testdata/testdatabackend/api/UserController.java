package com.testdata.testdatabackend.api;

import com.testdata.testdatabackend.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/{id}")
    public User getById(@PathVariable("id") String userId) {
        User user = User.builder()
                .id(userId)
                .firstName("John")
                .lastName("Doe")
                .email("john@gmail.com")
                .password("pass")
                .build();

        return user;
    }
}
