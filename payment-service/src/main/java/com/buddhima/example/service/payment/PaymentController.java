package com.buddhima.example.service.payment;

import com.buddhima.example.service.payment.clients.CustomerInfoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/payment")
public class PaymentController {

    private static Logger logger = Logger.getLogger(PaymentController.class.getName());

    @Autowired
    private CustomerInfoClient customerInfoClient;

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public String getName() {
        logger.log(Level.INFO, "Name called");
        return customerInfoClient.getName();
    }

    @RequestMapping(value = "/age", method = RequestMethod.GET)
    public int getAge() {
        logger.log(Level.INFO, "Age called");
        return customerInfoClient.getAge();
    }
}
