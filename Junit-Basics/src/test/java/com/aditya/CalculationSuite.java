package com.aditya;

import org.junit.jupiter.api.Tag;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeTags("success") // to run only the tests with the tag "success")
@ExcludeTags("failure") // to exclude the tests with the tag "failure"
@SelectClasses({AdditionTest.class, MultiplicationTest.class, DivisionTest.class})
public class CalculationSuite {
}
