package com.test02.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("test002")
    public String test(String name){
        if(name.equals("2")){
            throw new RuntimeException("====出错了====");
        }

        System.out.println("=========实例被访问=========");
        return name;
    }
}
