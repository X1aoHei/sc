package com.wss.helloconsumer.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("hello-service")
public interface helloService {
    @RequestMapping("/hello1")
    public void hello();

    @RequestMapping("/show")
    public String show();
}
