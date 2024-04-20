package com.students.demo.dto;

import org.springframework.security.core.GrantedAuthority;

public record MyUser(
        String name,
        Iterable<? extends GrantedAuthority> roles)
{ }