package com.springboot.netflix.oss.feign.controller;

import com.springboot.netflix.oss.feign.client.UserClient;
import com.springboot.netflix.oss.feign.domain.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BaseController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/users")
    public List<UserResponse> retrieveAllUsers() {
        return userClient.getUsers();
    }


}
