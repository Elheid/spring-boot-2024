package com.students.demo.Controllers;


import com.students.demo.dto.MyUser;
import jakarta.annotation.security.RolesAllowed;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/support/api")
@RolesAllowed({"SUPPORT"})
public class SupportApiController {

    @GetMapping
    public MyUser getNameAndRole(@AuthenticationPrincipal UserDetails user) {
        return new MyUser(user.getUsername(), user.getAuthorities());
    }
}