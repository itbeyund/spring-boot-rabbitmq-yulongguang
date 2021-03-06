package com.neo.rabbit.many;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ManyToManyController {



    @Autowired
    private NeoSender neoSender;

    @Autowired
    private NeoSender2 neoSender2;

    // http://localhost:8081/manyToMany


    @GetMapping(value = "/manyToMany")
    public void manyToMany() throws Exception {
        for (int i=0;i<100;i++){
            neoSender.send(i);
            neoSender2.send(i);
        }
    }


}
