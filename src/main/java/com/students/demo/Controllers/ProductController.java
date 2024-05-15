package com.students.demo.Controllers;

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
        var id = Integer.parseInt(productId);
        if (!service.containsProduct(id)){
            var product = new Product(productId, 0, id);
            service.putPurchasesProduct(product);
        }
        service.increaseProductCount(id);
        return "Product " + productId + " has been purchased.";
    }
}