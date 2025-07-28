package com.aditya;

public class Calculator {

    CalculatorService calculatorService;

    Calculator(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    int add(int a, int b) {
        return calculatorService.add(a, b);
    }
    int subtract(int a, int b) {
        return calculatorService.subtract(a, b);
    }
    int multiply(int a, int b) {
        return calculatorService.multiply(a, b);
    }
    double divide(int a, int b) throws ArithmeticException {
        return calculatorService.divide(a, b);
    }
}
