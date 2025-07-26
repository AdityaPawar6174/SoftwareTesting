package com.aditya;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

public class AdditionTest {

    @org.junit.jupiter.api.Test
    @Tag("failure")
    @Tag("success")
    @DisplayName("Adding Test")
    void testAdd()
    {
        CalculationUtil cu = new CalculationUtil();
        int actual = cu.add(10, 20);
        int expected = 30;
        Assertions.assertEquals(expected, actual, "Not equal to 30");
    }
}
