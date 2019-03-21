package com.tonly.controller;

import com.tonly.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    HelloService helloService;

    @GetMapping("/helloService")
    public String customer(){
        return helloService.helloService();
    }
}
