package com.springboot.netflix.oss.feign.controller;

import com.springboot.netflix.oss.feign.client.UserClient;
import com.springboot.netflix.oss.feign.domain.User;
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
