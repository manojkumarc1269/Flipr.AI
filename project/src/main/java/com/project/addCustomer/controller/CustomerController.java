package com.project.addCustomer.controller;

import com.project.addCustomer.beans.Customer;
import com.project.addCustomer.services.CustomerServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    private CustomerServie service;

    @PostMapping("/addCustomer")
    public Customer Customer(@RequestBody Customer customer){

        return service.addCustomer(customer);
    }
}

