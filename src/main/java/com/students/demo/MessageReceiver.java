package com.students.demo;

import com.students.demo.dto.HomeworkMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
/*
@Service
public class MessageReceiver {

    @RabbitListener(queues = "homework.rs")
    public void receiveMessage(HomeworkMessage message) {
        System.out.println("Received message: " + message);
    }
}*/