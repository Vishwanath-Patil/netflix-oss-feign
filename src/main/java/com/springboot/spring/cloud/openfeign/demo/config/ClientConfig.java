package com.springboot.spring.cloud.openfeign.demo.config;

import com.springboot.spring.cloud.openfeign.demo.exceptionhandler.CustomExceptionHandler;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfig {

    @Bean
    public ErrorDecoder errorDecoder() {
        return new CustomExceptionHandler();
    }
}
