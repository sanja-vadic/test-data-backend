package com.testdata.testdatabackend.api;

import com.testdata.testdatabackend.api.models.RequestAuth;
import com.testdata.testdatabackend.data.UsersData;
import com.testdata.testdatabackend.models.Auth;
import com.testdata.testdatabackend.models.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    UsersData usersData = new UsersData();

    @GetMapping("/user/{id}")
    public User getById(@PathVariable("id") String userId) {
        return usersData.getById(userId);
    }

    @GetMapping("/user")
    public List<User> getAll() {
        return usersData.getUsers();
    }

    @PostMapping("/user/auth")
    public Auth authenticate(@RequestBody RequestAuth requestAuth) {
        return usersData.authenticate(requestAuth.getEmail(), requestAuth.getPassword());
    }
}
