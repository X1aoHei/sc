package com.wss.helloconsumer.Controller;

import com.wss.helloconsumer.Service.helloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private helloService helloService;

    @RequestMapping("/h")
    public String hello(){
        helloService.hello();
        return "aa";
    }

    @RequestMapping("/s")
    public void ss(){
        String show = helloService.show();
        System.out.println(show);
    }
}
