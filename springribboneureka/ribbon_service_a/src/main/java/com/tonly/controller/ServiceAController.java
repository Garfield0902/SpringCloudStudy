package com.tonly.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceAController {
    @GetMapping("/hello")
    public String testA(){
        return "Hello Ribbon A";
    }

}
