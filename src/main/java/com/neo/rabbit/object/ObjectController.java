package com.neo.rabbit.object;

import com.neo.model.User;
import com.neo.rabbit.fanout.FanoutSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ObjectController {



    @Autowired
    private ObjectSender sender;

    //http://localhost:8081/object

    @GetMapping(value = "/object")
    public void sendOject() throws Exception {
        User user=new User();
        user.setName("neo");
        user.setPass("123456");
        sender.send(user);
    }


}
