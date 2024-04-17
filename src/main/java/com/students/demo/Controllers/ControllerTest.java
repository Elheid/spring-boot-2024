package com.students.demo.Controllers;

import com.students.demo.dto.Data;
import jakarta.validation.Valid;
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
}