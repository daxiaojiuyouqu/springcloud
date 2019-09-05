package com.yuxinsheng.serviceregistercentre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegisterCentreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRegisterCentreApplication.class, args);
    }

}
