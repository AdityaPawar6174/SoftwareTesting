package com.aditya;

public interface CalculatorService {
    int add(int a, int b);
    int subtract(int a, int b);
    int multiply(int a, int b);
    double divide(int a, int b) throws ArithmeticException;
}
