package com.aditya;

import org.junit.jupiter.api.*;

public class TestInfoAndReportDemo {

    TestInfo testInfo;          // To get the information about the test method
    TestReporter testReporter;  // To report the information about the test method

    CalculationUtil cu;
    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter){
        this.testInfo = testInfo;
        this.testReporter = testReporter;
        cu = new CalculationUtil();
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Adding Test")
    @Tag("Valid") // Tag is mandatory to use TestReporter
    void testAdd()
    {
        System.out.println(testInfo.getTestClass());
        System.out.println(testInfo.getTestMethod());
        System.out.println(testInfo.getDisplayName());
        System.out.println(testInfo.getTags());
        CalculationUtil cu = new CalculationUtil();
        int actual = cu.add(10, 20);
        int expected = 30;
        Assertions.assertEquals(expected, actual, "Not equal to 30");
    }

    @Test
    @DisplayName("Multiply Test")
    @Tag("Success") // Tag is mandatory to use TestReporter
    @Tag("Valid") // Multiple tags can be used
    void testMultiply(){
        testReporter.publishEntry("Running test Report -->"+
                "\n Test Class: " + testInfo.getTestClass() +
                "\n Display Name: " + testInfo.getDisplayName() +
                "\n Method: " + testInfo.getTestMethod() +
                "\n Tags: " + testInfo.getTags());
        CalculationUtil cu = new CalculationUtil();
        int actual = cu.multiply(10, 20);
        int expected = 200;
        Assertions.assertEquals(expected, actual, "Expected 200");
    }
}
