package com.aditya;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CSVParamsTesting2 {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testingFile.csv", numLinesToSkip = 1) // This reads data from a CSV file
    void add(int a, int b) {
        int expected = 30;
        int actual = a + b;
        assertEquals(expected, actual);
    }
}
