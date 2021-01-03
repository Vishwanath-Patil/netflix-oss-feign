package com.springboot.netflix.oss.feign.circuitbreaker;

import com.springboot.netflix.oss.feign.client.UserClient;
import com.springboot.netflix.oss.feign.domain.User;
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
