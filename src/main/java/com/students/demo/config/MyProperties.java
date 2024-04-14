package com.students.demo.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "myapp")
@EnableConfigurationProperties
public class MyProperties {
    private List<String> listValues;
    private String environmentVariable;
}