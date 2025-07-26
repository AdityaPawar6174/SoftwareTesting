package com.aditya;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class DivisionTest {

    @Test
    @Tag("success")
    void testDivException()
    {
        CalculationUtil cu = new CalculationUtil();
        Assertions.assertDoesNotThrow(() -> cu.div(10, 2), "exception in code");
    }
}
