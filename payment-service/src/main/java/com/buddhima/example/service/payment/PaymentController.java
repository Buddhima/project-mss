package com.buddhima.example.service.payment;

import com.buddhima.example.service.payment.clients.CustomerInfoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping(value = "/payment")
public class PaymentController {

    /*@RequestMapping(method = GET)
    public boolean version() {
        System.out.println("Version requested!");
        return true;
    }*/

    @Autowired
    private CustomerInfoClient customerInfoClient;

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public String getName() {
        return customerInfoClient.getName();
    }

    @RequestMapping(value = "/age", method = RequestMethod.GET)
    public int getAge() {
        return customerInfoClient.getAge();
    }
}
