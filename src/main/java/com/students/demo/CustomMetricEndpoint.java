package com.students.demo;


import com.students.demo.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Service;


@Service
@Endpoint(id = "custom-metric")
public class CustomMetricEndpoint {

    private final ProductService service;

    public CustomMetricEndpoint(ProductService service) {
        this.service = service;
    }
    @ReadOperation
    public String customMetric() {
        var products = service.getAllProducts();
        StringBuilder message = new StringBuilder();
        for (Product product : products) {
            message.append("Product: ").append(product.getName()).append(", Quantity: ").append(product.getAmount()).append("\n");
        }
        return message.toString();
    }
}
