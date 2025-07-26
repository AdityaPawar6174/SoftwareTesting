package com.aditya;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) // to change the default instance from PER_METHOD to PER_CLASS
public class ChangeDefaultInstanceTest {

    CalculationUtil cu;

    @BeforeAll
    public void beforeAllInit(){ // static required if @TestInstance is not used
        System.out.println("Before all is executed");
    }

    @BeforeEach
    void init(){
        System.out.println("---Before every test it will be executed---");
        cu = new CalculationUtil(); // instantiation of an object
    }

    @AfterEach
    void cleanUpCode(){
        System.out.println("---Cleaning---");
    }

    @AfterAll
    public void afterAllTests(){ // static required if @TestInstance is not used
        System.out.println("After all tests are executed");
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Adding Test")
    void testAdd()
    {
        CalculationUtil cu = new CalculationUtil(); // instantiation of an object
        int actual = cu.add(10, 20);
        int expected = 30;
        Assertions.assertEquals(expected, actual, "Not equal to 30");
    }

}
