package com.students.demo.Controllers;

import com.students.demo.MyServiceSecond;
import com.students.demo.config.MyProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class ConfigController {

    private final MyProperties myProperties;
    private final MyServiceSecond service;


    @GetMapping("/config")
    public String getConfig() {
        return service.createConfigResponse(myProperties);
    }
}