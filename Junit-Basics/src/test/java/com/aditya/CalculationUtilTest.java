package com.aditya;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculationUtilTest {

    @org.junit.jupiter.api.Test // to make a method as a test method, all the instances are created by Junit
    @DisplayName("SampleTest")
    @Order(value = 5) // to order the test cases
    void testShow(){
        System.out.println("Hello");
    }

    // all the test cases run parallelly
    // by default for each test case there will be different instance
    @org.junit.jupiter.api.Test
    @DisplayName("Adding Test")
    @Order(value = 1)
    void testAdd()
    {
        CalculationUtil cu = new CalculationUtil(); // instantiation of an object
        int actual = cu.add(10, 20);
        int expected = 30;
        Assertions.assertEquals(expected, actual, "Not equal to 30");
    }

    @Test
    @DisplayName("Multiply Test")
    @Order(value = 3)
    void testMultiply(){
        CalculationUtil cu = new CalculationUtil();
        int actual = cu.multiply(10, 20);
        int expected = 200;
        Assertions.assertEquals(expected, actual, "Expected 200");
    }

    @Test
    @Order(value = 10)
    @Disabled
        // for not going to use ---> will be ignored
    void testFail()
    {
        Assertions.fail("This test is going to be failed always");
    }

    @Test
    @Order(value = 9)
    void testNullString()
    {
        CalculationUtil cu = new CalculationUtil();
//        String input = null;
        String input = "1234";
        String result = cu.parseString(input);
        Assertions.assertNotNull(result);
    }

    @Test
    @Order(value = 8)
    void testDivException()
    {
        CalculationUtil cu = new CalculationUtil();
        Assertions.assertThrows(ArithmeticException.class,
                () -> cu.div(10, 0));
    }


    @Test
    @DisplayName("Division Test")
    @Tag("success")
    @Order(value = 4)
    void testDiv()
    {
        CalculationUtil cu = new CalculationUtil();
        Assertions.assertDoesNotThrow(() -> cu.div(10, 2), "exception in code");
    }

    @Test
    @Order(value = 7)
    void testCompareObject()
    {
        String s1 = "Hi";
        String s2 = "Hi";
        Assertions.assertSame(s1, s2); // to check the exact value of the Objects
    }

    @Test
    @Order(value = 6)
    void testCompareObjectInHeap()
    {
        String s1 =  new String("Hi"); // in Heap memory
        String s2 = new String("Hi"); // in Heap memory
        Assertions.assertEquals(s1, s2); // to check the content of the Objects
    }
}
