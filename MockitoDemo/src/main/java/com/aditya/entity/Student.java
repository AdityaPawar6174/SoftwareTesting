package com.aditya.entity;

import com.aditya.service.StudentService;

public class Student {

    StudentService studentService;

    public Student(StudentService studentService) {
        this.studentService = studentService;
    }

    public int getAverageMarks() {
        return studentService.getTotalMarks() / studentService.getTotalStudents();
    }

}
