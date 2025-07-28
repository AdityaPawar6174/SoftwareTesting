package com.aditya;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CalculatorTest {

    CalculatorService calculatorService = Mockito.mock(CalculatorService.class);
    Calculator calculator = null;

    @BeforeEach
    void setUp() {
        calculator = new Calculator(calculatorService);
        System.out.println("Setting up the Calculator instance for testing.");
    }


    @org.junit.jupiter.api.Test
    void testAdd() {
        int a = 5;
        int b = 10;
        int expectedSum = 15;

        Mockito.when(calculatorService.add(a, b)).thenReturn(expectedSum);

        int result = calculator.add(a, b);
       Assertions.assertEquals(expectedSum, result);
    }

    @Test
    void subtract() {
        int a = 5;
        int b = 10;
        int expected = -5;

        Mockito.when(calculatorService.subtract(a, b)).thenReturn(expected);

        int actual = calculator.subtract(a, b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void multiply()
    {
        int a = 5;
        int b = 10;
        int expectedProduct = 50;

        Mockito.when(calculatorService.multiply(a, b)).thenReturn(expectedProduct);

        int result = calculator.multiply(a, b);

        Assertions.assertEquals(expectedProduct, result);
    }

    @Test
    void testDivide()
    {
        int a = 10;
        int b = 2;

        double expectedResult = 5.0;

        Mockito.when(calculatorService.divide(a, b)).thenReturn(expectedResult);

        double result = calculator.divide(a, b);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void testPerform()
    {
        Mockito.when(calculatorService.divide(10, 0))
                .thenThrow(ArithmeticException.class);

        Assertions.assertThrows(ArithmeticException.class,
                () -> calculatorService.divide(10, 0));
    }
}
