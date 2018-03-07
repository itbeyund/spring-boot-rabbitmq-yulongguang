package com.neo.rabbit.many;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OneToManyController {

    @Autowired
    private NeoSender neoSender;


    // http://localhost:8081/oneToMany
    @GetMapping(value = "/oneToMany")
    public void oneToMany() throws Exception {
        for (int i=0;i<100;i++){
            neoSender.send(i);
        }
    }
}
