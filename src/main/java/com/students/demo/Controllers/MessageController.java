package com.students.demo.Controllers;

import com.students.demo.MessageSender;
import com.students.demo.dto.HomeworkMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private MessageSender messageSender;

    @PostMapping("/send")
    public String sendMessage(@RequestBody HomeworkMessage message) throws InterruptedException {
        messageSender.sendMessage(message);
        return "Message sent successfully!";
    }
}