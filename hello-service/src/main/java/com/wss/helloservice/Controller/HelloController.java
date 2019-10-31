package com.wss.helloservice.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello1")
    public void log(){
        System.out.println("hello");
    }

    @RequestMapping("/show")
    public String show(){
        return "123";
    }
}
