package com.ribbon01.api;

import org.springframework.stereotype.Component;

@Component
public class TestFallBack implements TestApi {

    @Override
    public String test002(String name) {
        return "服务出错了";
    }
}
