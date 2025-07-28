package com.aditya;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EmployeeServiceValidTest {

    private EmployeeService employeeService;

    @BeforeEach
    void setup()
    {
        employeeService = new EmployeeService();
        System.out.println("Setting up EmployeeService for testing");
    }

    @AfterEach
    void cleanup()
    {
        employeeService = null;
        System.out.println("Cleaning up EmployeeService after testing");
    }


    @Test
    @Order(1)
    @DisplayName("Should Calculate Correct Yearly Salary")
    void calculateYearlySalary_valid_test(){
        Employee employee = new Employee(1, "Aditya", 50000);
        double expectedYearlySalary = 600000;
        Assertions.assertEquals(expectedYearlySalary, employeeService.calculateYearlySalary(employee));
    }

    @Test
    @DisplayName("Should Give Correct Hike for Salary < 10000")
    @Order(2)
    void testCalculateHike_LowSalary() {
        Employee emp = new Employee(2, "Alex", 8000);
        double expectedSalary = 2000;
        Assertions.assertEquals(expectedSalary, employeeService.calculateSalaryHike(emp));
    }

    @Test
    @DisplayName("Should Give Correct Hike for Salary >= 10000")
    @Order(3)
    void testCalculateHike_HighSalary() {
        Employee emp = new Employee(3, "Priya", 15000);
        double expectedSalary = 1000;
        Assertions.assertEquals(expectedSalary, employeeService.calculateSalaryHike(emp));
    }

}
