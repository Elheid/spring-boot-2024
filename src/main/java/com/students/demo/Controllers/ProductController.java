package com.students.demo.Controllers;

import com.students.demo.CustomActuatorEndpoint;
import com.students.demo.CustomMetricEndpoint;
import com.students.demo.ProductService;
import com.students.demo.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/purchases")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/buy/{productId}")
    public String buyProduct(@PathVariable String productId) {
        var productName = "product"+productId;
        if (!service.containsProduct(productName)){
            var product = new Product(productName, 0);
            service.putPurchasesProducts(product);
        }
        service.increaseProductCount(productName);
        return "Product " + productId + " has been purchased.";
    }
}