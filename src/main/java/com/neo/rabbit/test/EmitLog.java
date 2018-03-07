package com.neo.rabbit.test;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.util.concurrent.TimeoutException;

public class EmitLog {

    private static final String EXCHANGE_NAME = "logs";

    public static void main(String[] argv)
            throws java.io.IOException {

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = null;
        try {
            connection = factory.newConnection();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
        Channel channel = connection.createChannel();

        channel.exchangeDeclare(EXCHANGE_NAME, "fanout");

        String message = getMessage(argv);


        //channel.basicPublish("","hello",null,message.getBytes());

        channel.basicPublish(EXCHANGE_NAME, "", null, message.getBytes());
        
        System.out.println(" [x] Sent '" + message + "'");

        try {
            channel.close();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
        connection.close();
    }
    public static String getMessage(String[] message){
        String stringArray[] = {"大爷", "二大爷", "三大爷"};
        return String.valueOf(stringArray);
    }
}
