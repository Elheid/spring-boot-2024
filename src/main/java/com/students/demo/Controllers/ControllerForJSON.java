package com.students.demo.Controllers;


import com.students.demo.dto.MyData;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
public class ControllerForJSON {
    @PostMapping("/someData")
    public MyData getAndChangeJson(@RequestBody MyData someData) {
        Random random = new Random();
        MyData newData = new MyData(someData.getPrice(), someData.getInfo());
        newData.getInfo().setId(random.nextInt(0,100));
        return newData;
    }

}
