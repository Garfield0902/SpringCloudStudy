package com.tonly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RibbonServiceBApp {
    public static void main(String[] args) {
        SpringApplication.run(RibbonServiceBApp.class,args);
    }
}
