package com.springboot.netflix.oss.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class NetflixOssFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixOssFeignApplication.class, args);
    }

}
