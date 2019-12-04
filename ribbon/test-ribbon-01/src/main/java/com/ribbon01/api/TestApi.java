package com.ribbon01.api;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="ribbon02",fallback = TestFallBack.class)
@Hystrix
public interface TestApi {

    @RequestMapping("test002")
    public String test002(@RequestParam("name")String name);
}
