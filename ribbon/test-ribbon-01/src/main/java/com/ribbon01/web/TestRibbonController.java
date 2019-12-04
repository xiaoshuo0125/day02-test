package com.ribbon01.web;

import com.ribbon01.api.TestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRibbonController {

    @Autowired
    private TestApi testApi;

    @RequestMapping("test01/{name}")
    public String test(@PathVariable String name){
        String test002 =testApi.test002(name);
        return test002;
    }

}
