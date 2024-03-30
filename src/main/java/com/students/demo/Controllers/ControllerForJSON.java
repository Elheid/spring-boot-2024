package com.students.demo.Controllers;


import com.students.demo.MyService;
import com.students.demo.dto.request.DataRequest;
import com.students.demo.dto.response.MyData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class ControllerForJSON {
    @Autowired
    MyService service;
    @PostMapping("/someData")
    public MyData getAndChangeJson(@RequestBody DataRequest someData) {
        MyData newData = new MyData(someData.getPrice(), someData.getInfo());
        newData.getInfo().setId(service.GetRandomId());
        return newData;
    }
}
