package com.yuxinsheng.serviceclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "say/hi")
    public String sayHi() {
        return "Hi,我是来自端口:" + port + "的返回";
    }

}
