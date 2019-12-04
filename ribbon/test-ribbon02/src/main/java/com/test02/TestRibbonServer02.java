package com.test02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestRibbonServer02 {
    public static void main(String[] args) {
        SpringApplication.run(TestRibbonServer02.class);
    }
    @RequestMapping("/testHealth")
    public String test(){
        System.out.println("====ribbon02====");
        return "ok";
    }
}
