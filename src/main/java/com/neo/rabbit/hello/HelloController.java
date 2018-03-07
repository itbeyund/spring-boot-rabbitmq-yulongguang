package com.neo.rabbit.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {


    @Autowired
    private HelloSender helloSender;

     // http://localhost:8081/hello
    @GetMapping(value = "/hello")
    public void hello() throws Exception {
        helloSender.send();
    }
}
