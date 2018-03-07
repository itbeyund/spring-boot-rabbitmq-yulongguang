package com.neo.rabbit.fanout;

import com.neo.rabbit.hello.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class FanoutController {


    @Autowired
    private FanoutSender sender;


    //http://localhost:8081/fanout
    @GetMapping(value = "/fanout")
    public void fanoutSender() throws Exception {
        sender.send();
    }

}
