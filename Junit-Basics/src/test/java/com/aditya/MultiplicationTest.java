package com.aditya;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class MultiplicationTest {

    @Test
    @Tag("success")
    @DisplayName("Multiplication Test")
    void testMultiply() {
        CalculationUtil cu = new CalculationUtil();
        int actual = cu.multiply(10, 20);
        int expected = 200;
        Assertions.assertEquals(expected, actual, "Multiplication result is not as expected");
    }
}
