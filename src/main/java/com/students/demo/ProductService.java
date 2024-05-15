package com.students.demo;

import com.students.demo.dto.Product;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {

    private Map<Integer, Product> products;

    public ProductService() {
        products = new HashMap<>();
    }

    public void putPurchasesProduct(Product product){
        products.put(product.getId(), product);
    }

    public boolean containsProduct(Integer productId) {
        return products.containsKey(productId);
    }

    public Optional<Product> getProductQuantity(Integer productId) {
        return Optional.ofNullable(products.get(productId));
    }

    public void increaseProductCount(Integer productId) {
        products.computeIfPresent(productId, (key, product) -> {
            product.setAmount(product.getAmount() + 1);
            return product;
        });
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(products.values());
    }

}