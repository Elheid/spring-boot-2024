package com.students.demo;

import com.students.demo.dto.Product;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {

    private final List<Product> products;

    public ProductService() {
        products = new ArrayList<>();
    }

    public void putPurchasesProducts(Product product){
        products.add(product);
    }

    public void increaseProductCount(String productName){
        products.stream()
                .filter(product -> product.getName().equals(productName))
                .findFirst()
                .ifPresent(product -> product.setAmount(product.getAmount() + 1));
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }
    public boolean containsProduct(String productName) {
        return products.stream()
                .anyMatch(product -> product.getName().equals(productName));
    }

    public Optional<Product> getProductQuantity(String productName) {
        // Получаем количество продуктов по идентификатору
        return products.stream()
                .filter(product -> product.getName().equals(productName))
                .findFirst();
    }
}