package com.buddhima.example.service.payment.clients;

import org.springframework.stereotype.Component;

@Component
public class CustomerInfoClientFallback implements CustomerInfoClient {

    @Override
    public String getName() {
        return "fallback";
    }

    @Override
    public int getAge() {
        return -1;
    }
}
