package com.aditya;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CSVParamsTesting {

    @ParameterizedTest
    @CsvSource({"10,20","3,4"}) // This provides a set of integer pairs to the test method
    void addCSV(int a, int b)
    {
        int expected = 30;
        int actual = a + b;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"10:20", "3:4"}, delimiterString = ":") // This provides a set of integer pairs with a custom delimiter
    void addCustomSymbolSeparatedValue(int a, int b){
        int expected = 30;
        int actual = a + b;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"10,20,30", "3,4,7"}) // This provides a set of integer triplets to the test method
    void addVariation(int a, int b, int c){
        int actual = a + b;
        assertEquals(c, actual);
    }

}
