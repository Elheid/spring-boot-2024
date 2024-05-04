package com.students.demo.Controllers;


import com.students.demo.CustomActuatorEndpoint;
import com.students.demo.CustomMetricEndpoint;
import com.students.demo.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @Autowired
    private CustomMetricEndpoint customMetricEndpoint;

    @Autowired
    private CustomActuatorEndpoint customActuatorEndpoint;


    @GetMapping("/calculate-metric")
    public String calculateMetric() {
        return customMetricEndpoint.customMetric();
    }

    @GetMapping("/invoke-actuator")
    public String invokeActuator() {
        return customActuatorEndpoint.customActuator();
    }
}