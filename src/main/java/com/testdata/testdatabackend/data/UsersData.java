package com.testdata.testdatabackend.data;

import com.testdata.testdatabackend.models.User;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class UsersData {
    private List<User> users = new ArrayList<>(List.of(
            User.builder()
                    .id("1000")
                    .firstName("Sanja")
                    .lastName("Vadic")
                    .email("sanja@gmail.com")
                    .password("sanjapass")
                    .build(),
            User.builder()
                    .id("1001")
                    .firstName("Bojan")
                    .lastName("Jelicic")
                    .email("bojan@gmail.com")
                    .password("bojanpass")
                    .build(),
            User.builder()
                    .id("1002")
                    .firstName("John")
                    .lastName("Doe")
                    .email("john@gmail.com")
                    .password("johnpass")
                    .build(),
            User.builder()
                    .id("1003")
                    .firstName("Pero")
                    .lastName("Peric")
                    .email("pero@gmail.com")
                    .password("peropass")
                    .build(),
            User.builder()
                    .id("1004")
                    .firstName("Simo")
                    .lastName("Simic")
                    .email("simo@gmail.com")
                    .password("simopass")
                    .build()
    ));

    public User getById(String id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
