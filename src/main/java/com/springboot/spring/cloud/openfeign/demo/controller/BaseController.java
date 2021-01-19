package com.springboot.spring.cloud.openfeign.demo.controller;

import com.springboot.spring.cloud.openfeign.demo.client.UserClient;
import com.springboot.spring.cloud.openfeign.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BaseController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return userClient.fetchUsers();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User userToBeCreated) {
        return userClient.createUser(userToBeCreated);
    }

    @GetMapping("/users/{userId}")
    public User fetchUserById(@PathVariable String userId) {
        return userClient.fetchUserById(userId);
    }

}
