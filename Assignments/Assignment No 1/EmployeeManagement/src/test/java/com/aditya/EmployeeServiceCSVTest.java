package com.aditya;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class EmployeeServiceCSVTest {

    private final EmployeeService employeeService = new EmployeeService();

    @ParameterizedTest
    @CsvFileSource(resources = "/employee_data.csv", numLinesToSkip = 1)
    void testCalculateYearlySalary_FromCSV(int id, String name, double monthlySalary, double expectedYearly) {
        Employee emp = new Employee(id, name, monthlySalary);
        Assertions.assertEquals(expectedYearly, employeeService.calculateYearlySalary(emp));
    }
}
