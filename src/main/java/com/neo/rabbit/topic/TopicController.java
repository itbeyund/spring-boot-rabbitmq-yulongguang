package com.neo.rabbit.topic;

import com.neo.model.User;
import com.neo.rabbit.object.ObjectSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TopicController {




    @Autowired
    private TopicSender sender;

    //http://localhost:8081/topic
    @GetMapping(value = "/topic")
    public void topic() throws Exception {
        sender.send();
    }

    //http://localhost:8081/topic1
    @GetMapping(value = "/topic1")
    public void topic1() throws Exception {
        sender.send1();
    }

    //http://localhost:8081/topic1
    @GetMapping(value = "/topic2")
    public void topic2() throws Exception {
        sender.send2();
    }

}
