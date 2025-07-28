package com.aditya;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SelectClasses({
        EmployeeServiceValidTest.class,
        EmployeeServiceValidTest.class,
        EmployeeServiceCSVTest.class
})
@SuiteDisplayName("Employee Management - Full Test Suite")
public class AllTestClassesSuite {
}
