package com.buddhima.example.service.payment.clients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "customerinfo-service", path = "/customerinfo", fallback = CustomerInfoClientFallback.class)
public interface CustomerInfoClient {

    @RequestMapping(method = RequestMethod.GET, value = "/name")
    public String getName();

    @RequestMapping(method = RequestMethod.GET, value = "/age")
    public int getAge();
}
