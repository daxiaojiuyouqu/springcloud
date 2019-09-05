package com.yuxinsheng.servicefeign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "service-client", fallback = HystrixService.class)
public interface FeignSerivce {

    @GetMapping("say/hi")
    String sayHi();
}
