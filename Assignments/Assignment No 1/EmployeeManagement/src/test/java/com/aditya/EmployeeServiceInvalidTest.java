package com.aditya;

import org.junit.jupiter.api.*;

public class EmployeeServiceInvalidTest {

    private EmployeeService employeeService;
    private Employee employee;

    @BeforeEach
    void setUp() {
        employeeService = new EmployeeService();
    }

    @Test
    void invalidYearlySalaryForZeroSalary() {
        employee = new Employee(1, "Invalid Employee", 0.0);
        Assertions.assertEquals(0.0, employeeService.calculateYearlySalary(employee));
    }

    @Test
    void invalidHikeCalculationNegativeSalary() {
        employee = new Employee(2, "Invalid Negative Salary", -5000.0);
        Assertions.assertEquals(0.0, employeeService.calculateSalaryHike(employee));
    }
}
