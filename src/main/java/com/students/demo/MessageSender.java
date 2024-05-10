package com.students.demo;

import com.students.demo.dto.HomeworkMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

@Service
public class MessageSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(HomeworkMessage message) {
        //HomeworkMessage message = new HomeworkMessage(3, "example text", 1L);
        //var strMessage = message.count() + message.text() + message.delay();
        rabbitTemplate.convertAndSend("homework", "homework.in", message);
        System.out.println("Sent message: " + message);
    }
}