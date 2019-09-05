package com.yuxinsheng.servicefeign.feign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HystrixService implements FeignSerivce {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Override
    public String sayHi() {
        LOGGER.error("服务出错...");
        return "error";
    }
}
