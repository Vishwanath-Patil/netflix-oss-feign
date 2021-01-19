package com.springboot.spring.cloud.openfeign.demo.circuitbreaker;

import com.springboot.spring.cloud.openfeign.demo.client.UserClient;
import com.springboot.spring.cloud.openfeign.demo.domain.User;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class UserServiceFallbackHandler implements UserClient {
    @Override
    public List<User> fetchUsers() {
        return Collections.emptyList();
    }

    @Override
    public User createUser(User userToBeCreated) {
        return new User();
    }

    @Override
    public User fetchUserById(String userId) {
        return null;
    }
}
