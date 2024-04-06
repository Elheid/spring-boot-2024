package com.students.demo.Controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ControllerForHeaders {
    @GetMapping("/headers")
    public List<String> getAllHeaders(@RequestHeader HttpHeaders headers) {
        return new ArrayList<>(headers.keySet());
    }
}
