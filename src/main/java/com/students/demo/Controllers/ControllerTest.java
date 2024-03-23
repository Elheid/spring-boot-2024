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
    public ResponseEntity<String> validateData(@RequestBody @Valid Data data) {
        return ResponseEntity.status(HttpStatus.OK)
                .body("Data is valid: " + data.getData());
    }
}