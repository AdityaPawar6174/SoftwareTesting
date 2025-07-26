package com.aditya;

import org.junit.jupiter.api.*;

public class NestedClassesDemo {

    CalculationUtil cu;

    @BeforeEach
    void init(){
        cu = new CalculationUtil();
    }

    @Nested
    class AddtionTest {

        @Test
        @DisplayName("Addition Test for Positive Numbers")
        void addPositive(){
            int actual = cu.add(10, 20);
            int expected = 30;
            Assertions.assertEquals(expected, actual, "Not equal to 30");
        }

        @Test
        @DisplayName("Addition Test for Negative Numbers")
        void addNegative(){
            int actual = cu.add(-10, -20);
            int expected = -30;
            Assertions.assertEquals(expected, actual, "Not equal to -30");
        }

        @Test
        @DisplayName("Multiplication Test")
        void multiplyTest(){
            int actual = cu.multiply(10, 20);
            int expected = 200;
            Assertions.assertEquals(expected, actual, "Expected 200");
        }
    }
}
