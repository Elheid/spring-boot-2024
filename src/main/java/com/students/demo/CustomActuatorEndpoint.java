package com.students.demo;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
@Endpoint(id = "custom-actuator")
@Log4j2
public class CustomActuatorEndpoint {
    @ReadOperation
    public String customActuator() {
        // Вывод сообщения с датой и временем вызова актуатора в лог
        var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        log.info("Custom Actuator Called at: " + LocalDateTime.now().format(formatter));

        return "Custom Actuator Executed!";
    }
}