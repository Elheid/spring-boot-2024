package com.students.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

@Configuration
public class UserConfiguration {

    @Bean
    public UserDetailsService userDetailsService(BCryptPasswordEncoder bCryptPasswordEncoder) {
        UserDetails user = User.withUsername("user")
                .password(bCryptPasswordEncoder.encode("password"))
                .roles("USER")
                .build();

        UserDetails support = User.withUsername("support")
                .password(bCryptPasswordEncoder.encode("password"))
                .roles("SUPPORT")
                .build();

        UserDetails admin = User.withUsername("admin")
                .password(bCryptPasswordEncoder.encode("password"))
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user, support, admin);
    }
}