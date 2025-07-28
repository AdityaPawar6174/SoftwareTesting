package com.aditya;

public class EmployeeService {

    public double calculateYearlySalary(Employee employee){
        return employee.getMonthlySalary() * 12;
    }

    public double calculateSalaryHike(Employee employee){
        return (employee.getMonthlySalary() < 10000) ? 2000 : 1000;
    }
}
