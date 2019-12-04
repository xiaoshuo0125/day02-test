package com.hystrix01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;


@SpringBootApplication
@EnableHystrix
public class TestHystrixServer {

    public static void main(String[] args) {
        SpringApplication.run(TestHystrixServer.class);
    }

}
