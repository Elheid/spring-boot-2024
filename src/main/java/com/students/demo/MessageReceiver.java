package com.students.demo;

import com.students.demo.dto.HomeworkMessage;
import com.students.demo.dto.HomeworkMessageResponse;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageReceiver {

    @RabbitListener(queues = "homework.rs")
    public void receiveMessage(HomeworkMessageResponse message) {
        if (message.counter() == null){
            return;
        }
        System.out.println("Received message: " + message);
    }
}