package com.yuxinsheng.servicefeign.controller;

import com.yuxinsheng.servicefeign.feign.FeignSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHiController {

    @Autowired
    private FeignSerivce feignSerivce;

    @GetMapping(value = "say/hi")
    public String sayHi() {
        return this.feignSerivce.sayHi();
    }
}
