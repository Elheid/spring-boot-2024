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

    public void sendMessage(HomeworkMessage message) throws InterruptedException {

        rabbitTemplate.convertAndSend("homework", "homework.in", message);
        try {
            Thread.sleep(message.delay());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Sent message: " + message);
    }
}