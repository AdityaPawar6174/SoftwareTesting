package com.aditya;

import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {

    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (Product product : products) {
            total += product.getTotalPrice();
        }
        return total;
    }

    public int getProductCount() {
        return products.size();
    }

    public List<Product> getProducts() {
        return products;
    }
}
