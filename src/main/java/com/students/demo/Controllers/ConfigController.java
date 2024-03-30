package com.students.demo.Controllers;

import com.students.demo.MyServiceSecond;
import com.students.demo.config.MyProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConfigController {

    private final MyProperties myProperties;
    private MyServiceSecond service;

    @Autowired
    public ConfigController(MyProperties myProperties, MyServiceSecond service) {
        this.myProperties = myProperties;
        this.service = service;
    }

    @GetMapping("/config")
    public String getConfig() {
       return service.CreateConfigResponse(myProperties);
    }
}
