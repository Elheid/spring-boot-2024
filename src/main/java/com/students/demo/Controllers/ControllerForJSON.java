package com.students.demo.Controllers;


import com.students.demo.MyBeanSecond;
import com.students.demo.MyService;
import com.students.demo.dto.request.DataRequest;
import com.students.demo.dto.response.MyData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class ControllerForJSON {

    private MyService service;
    @Autowired
    private void setMyService2(MyService service) {
        this.service = service;
    }
    @PostMapping("/someData")
    public MyData getAndChangeJson(@RequestBody DataRequest someData) {
        return service.CreateResponse(someData);
    }
}
