package com.aditya;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SimpleParamsTesting {

    CalculationUtil cu;

    @BeforeEach
    void init() {
        cu = new CalculationUtil();
    }

    @ParameterizedTest // This annotation is used to indicate that the test method is parameterized
    @DisplayName("Even Number Test")
    @ValueSource(ints = {2, 4, 5, 8, 10}) // This provides a set of integers to the test method
    void isEvenTest(int number) {
        Assertions.assertTrue(cu.isEven(number));
    }

    @ParameterizedTest
    @NullSource // This annotation is used to provide null values to the test method
    void checkNull(String value){
        Assertions.assertNull(value);
    }

    @ParameterizedTest
    @EmptySource // This annotation is used to provide empty strings to the test method
    void checkEmptyValue(String value){
        Assertions.assertEquals("", value);
    }

    @ParameterizedTest
    @NullAndEmptySource // This annotation is used to provide both null and empty strings to the test method
    void checkNullAndEmpty(String value){
        Assertions.assertTrue(value == null || value.isEmpty());
    }
}
