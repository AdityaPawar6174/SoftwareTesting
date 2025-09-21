package com.aditya;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestFile {

    private Product product1;
    private Product product2;
    private ShoppingCart cart;

    @BeforeEach
    void setup(){
        product1 = new Product(3, "Laptop", 60000.0);
        product2 = new Product(2, "Smartphone", 20000.0);
        cart = new ShoppingCart();
    }

    // Product Class Test
    @Test
    void testProductTotalPrice(){
        assert product1.getTotalPrice() == 180000.0;
        assert product2.getTotalPrice() == 40000.0;
    }

    // ShoppingCart Class Tests
    // 1. Add Product Test
    @Test
    void testAddProduct(){
        cart.addProduct(product1);
        assertTrue(cart.getProducts().contains(product1));
        assertEquals(1, cart.getProductCount());
    }

    // 2. Total Price Test
    @Test
    void testCartTotalPrice(){
        cart.addProduct(product1);
        cart.addProduct(product2);
        assertEquals(220000.0, cart.getTotalPrice());
    }

    // 3. Product Count Test
    @Test
    void testProductCount(){
        cart.addProduct(product1);
        cart.addProduct(product2);
        assertEquals(2, cart.getProductCount());
    }

    // Edge Case Tests
    // 1. empty Cart
    @Test
    void testEmptyCart() {
        assertEquals(0, cart.getProductCount());
        assertEquals(0.0, cart.getTotalPrice());
    }

    // 2. Zero price and quantity product
    @Test
    void testZeroPriceAndQuantityProduct() {
        Product freeProduct = new Product(0, "Free Item", 0.0);
        cart.addProduct(freeProduct);
        assertEquals(1, cart.getProductCount());
        assertEquals(0.0, cart.getTotalPrice());
    }

    // Tests for validity of product information
    // 1. Negative price --> Invalid Input
    @Test
    void testNegativePriceException(){
        assertThrows(IllegalArgumentException.class, () -> {
            new Product(1, "Invalid Product", -100.0);
        });
    }

    // 2. Negative quantity --> Invalid Input
    @Test
    void testNegativeQuantityException(){
        assertThrows(IllegalArgumentException.class, () -> {
            new Product(-2, "Invalid Product", 100.0);
        });
    }

    // 3. Null or empty product name
    @Test
    void testNullOrEmptyProductNameException(){
        assertThrows(IllegalArgumentException.class, () -> {
            new Product(1, null, 100.0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Product(1, "", 100.0);
        });
    }
}
