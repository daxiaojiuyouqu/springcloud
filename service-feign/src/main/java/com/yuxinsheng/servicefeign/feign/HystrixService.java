package com.yuxinsheng.servicefeign.feign;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class HystrixService implements FeignService {


    @Override
    public String sayHi() {
        log.error("服务出错...");
        return "error";
    }
}
