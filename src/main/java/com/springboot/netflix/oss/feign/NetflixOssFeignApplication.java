package com.springboot.netflix.oss.feign;

import com.springboot.netflix.oss.feign.client.UserClient;
import com.springboot.netflix.oss.feign.domain.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@EnableFeignClients
public class NetflixOssFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixOssFeignApplication.class, args);
    }

}
