package com.wss.helloserver.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = {"/example"},method = RequestMethod.GET)
    public String getExample(){
        return "Hello World";
    }

}
