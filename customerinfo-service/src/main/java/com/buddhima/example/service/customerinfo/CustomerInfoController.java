package com.buddhima.example.service.customerinfo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/customerinfo")
public class CustomerInfoController {

    private static final Logger logger = Logger.getLogger(CustomerInfoController.class.getName());

    @RequestMapping(method = RequestMethod.GET, value = "/name")
    public String getName() {
        System.out.println("Name requested");
        logger.log(Level.INFO, "Name requested");

        return "foo";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/age")
    public int getAge() {
        System.out.println("Age requested");
        logger.log(Level.INFO, "Age requested");

        return 28;
    }
}
