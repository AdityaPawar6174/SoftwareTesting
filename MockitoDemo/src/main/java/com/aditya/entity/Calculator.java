package com.aditya.entity;

import com.aditya.service.CalculatorService;

public class Calculator {

    public CalculatorService service;

    public Calculator(CalculatorService service)
    {
        this.service = service;
    }

    public int perform(int x, int y)
    {
        return service.add(x, y);
    }
}
