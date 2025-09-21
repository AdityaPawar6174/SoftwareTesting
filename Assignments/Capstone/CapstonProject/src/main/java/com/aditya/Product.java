package com.aditya;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(int quantity, String name, double price) {
        if (price < 0 || quantity < 0) {
            throw new IllegalArgumentException("Price and Quantity must be non-negative");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Product name must not be null or empty");
        }
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
