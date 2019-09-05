package com.yuxinsheng.serviceribbon.controller;

import com.yuxinsheng.serviceribbon.service.SayHiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHiController {

    @Autowired
    private SayHiService sayHiService;

    @GetMapping(value = "say/hi")
    public String sayHi() {
        return this.sayHiService.sayHi();
    }
}
