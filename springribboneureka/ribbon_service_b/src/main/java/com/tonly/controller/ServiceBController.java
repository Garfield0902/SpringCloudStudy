package com.tonly.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {
    @GetMapping("/hello")
    public String testB(){
        return "Hello Ribbon B";
    }
}
