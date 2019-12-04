package com.ribbon01;

import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableFeignClients
@EnableCircuitBreaker  //熔断器
public class TestRibbon {
    public static void main(String[] args) {
        SpringApplication.run(TestRibbon.class);
    }
    @RequestMapping("/testHealth")
    public String test(){
        System.out.println("=====ribbon=====");
        return "ok";
    }
}
