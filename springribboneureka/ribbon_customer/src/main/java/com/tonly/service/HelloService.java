package com.tonly.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;  //负载均衡ribbon对象

    public String helloServiceFallBack(){
        return "HelloService Error occurred!";
    }

    @HystrixCommand(fallbackMethod = "helloServiceFallBack")//指定发生错误是的回调方法
    public String helloService(){
        // Get请求调用服务，restTemplate被@LoadBalanced注解标记，Get方法会自动进行负载均衡
        // restTemplate会交替调用service_a和service_b (service_a和service_b 注册在EureKa中的服务名为test-service)
        return restTemplate.getForObject("http://test-service/hello",String.class);
    }

}
