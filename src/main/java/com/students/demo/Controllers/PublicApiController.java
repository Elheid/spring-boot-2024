package com.students.demo.Controllers;

import com.students.demo.SpringSecurityConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public/api")
public class PublicApiController {

    @GetMapping
    public String publicApi() {
        return "Public API - доступ разрешен для всех";
    }
}