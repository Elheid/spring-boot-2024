package com.students.demo.Controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

@RestController
public class ControllerForHeaders {
    @GetMapping("/headers")
    public List<String> getAllHeaders(@RequestHeader HttpHeaders headers) {
        List<String> headerList = new ArrayList<>();
        headerList.addAll(headers.keySet());
        return headerList;
    }
}
