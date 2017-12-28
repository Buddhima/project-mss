package com.buddhima.example.service.customerinfo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customerinfo")
public class CustomerInfoController {

    @RequestMapping(method = RequestMethod.GET, value = "/name")
    public String getName() {
        System.out.println("Name requested");

        return "foo";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/age")
    public int getAge() {
        System.out.println("Age requested");

        return 28;
    }
}
