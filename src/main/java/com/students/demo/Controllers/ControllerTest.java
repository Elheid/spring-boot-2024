package com.students.demo.Controllers;

import com.students.demo.ApiService;
import com.students.demo.MyService;
import com.students.demo.dto.Data;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerTest {
    @GetMapping("/test")
    public String getAnswer() {
        return "Hello world!";
    }

    @PostMapping("/validate")
    public Data validateData(@RequestBody @Valid Data data) {
        return data;
    }

    private final ApiService service;

    @Autowired
    public ControllerTest(ApiService service) {
        this.service = service;
    }

    @GetMapping("/aspect")
    public String callApiMethod() {
        var value = service.doSomething();
        if (value == false){
            return "API method exceeded max count";
        }
        return "API method called";
    }

}