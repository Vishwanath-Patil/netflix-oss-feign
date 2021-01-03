package com.springboot.netflix.oss.feign.exceptionhandler;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomExceptionHandler implements ErrorDecoder {

    @Override
    public Exception decode(String s, Response response) {
        switch (response.status()) {
            case 400:
                return new BadRequestException("Something was bad with the request!! ");
            case 404:
                return new NotFoundException("The requested item was not found!!");
            default:
                return new Exception("Generic Error!!!");

        }
    }
}
