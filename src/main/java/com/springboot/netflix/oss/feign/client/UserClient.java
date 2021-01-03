package com.springboot.netflix.oss.feign.client;

import com.springboot.netflix.oss.feign.circuitbreaker.UserServiceFallbackHandler;
import com.springboot.netflix.oss.feign.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(url = "https://jsonplaceholder.typicode.com",
        name = "USER-CLIENT",
        fallback = UserServiceFallbackHandler.class)
public interface UserClient {

    @GetMapping("/users")
    public List<User> fetchUsers();

    @PostMapping("/users")
    public User createUser(@RequestBody User userToBeCreated);

    @GetMapping("/users/{userId}")
    public User fetchUserById(@PathVariable String userId);
}
