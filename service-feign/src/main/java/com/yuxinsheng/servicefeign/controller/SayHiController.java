package com.yuxinsheng.servicefeign.controller;

import com.yuxinsheng.servicefeign.feign.FeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SayHiController {

    @Resource
    private FeignService feignService;

    @GetMapping(value = "say/hi")
    public String sayHi() {
        return this.feignService.sayHi();
    }
}
