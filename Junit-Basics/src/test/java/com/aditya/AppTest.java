package com.aditya;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Unit test for simple App.
 */

public class AppTest
{
    CalculationUtil cu;

    @BeforeAll
    static  void beforeAllInit(){
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
//        cu = null; // clean up code
    }
    @AfterAll
    static void afterAllTests(){
        System.out.println("After all tests are executed");
    }

    // assertAll will be TRUE, if all the assertion are TRUE
    @Test
    @DisplayName("AssertAll in Multiple Tests")
    void testMultiply(){
        int actual1 = cu.multiply(0, 5);
        int actual2 = cu.multiply(-2, -2);
//        assertEquals(0, actual1);
//        assertEquals(4, actual2);
        assertAll(
                () -> assertEquals(0, actual1, "Expected 0"),
                () -> assertEquals(4, actual2, "Expected 4"),
                () -> assertEquals(-2, cu.multiply(-2, 1))
        );
    }

    @RepeatedTest(3) // no need to mention @Test for the repeated test
    @DisplayName("Repetition Test")
    void myTest(RepetitionInfo repetitionInfo){
        System.out.println(repetitionInfo.getCurrentRepetition());
        assertEquals("hi", "hi");
    }


}