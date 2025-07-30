package com.aditya;

import com.aditya.entity.Student;
import com.aditya.service.StudentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class StudentTest {

    StudentService studentService = Mockito.mock(StudentService.class); // Mocking the StudentService

    Student student = new Student(studentService); // Injecting the mocked service into Student

    @Test
    void testAverageMarks()
    {
        int expectedAverage = 50;
        Mockito.when(studentService.getTotalMarks()).thenReturn(500); // Stubbing the method to return 500
        Mockito.when(studentService.getTotalStudents()).thenReturn(10); // Stubbing the method to return 10

        Assertions.assertEquals(expectedAverage, student.getAverageMarks());
    }
}
