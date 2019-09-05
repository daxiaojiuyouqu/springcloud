package com.yuxinsheng.serviceribbon.service.impl;

import com.yuxinsheng.serviceribbon.service.SayHiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SayHiServiceImpl implements SayHiService {

    @Autowired
    private RestTemplate restTemplate;

    private String SERVICE_CLIENT = "service-client";
    private String SAY_HI_PATH = "/say/hi";

    @Override
    public String sayHi() {
        return this.restTemplate.getForObject("http://" + SERVICE_CLIENT + SAY_HI_PATH, String.class);
    }
}
