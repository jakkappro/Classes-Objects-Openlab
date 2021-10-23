package com.kubino.learning;

import com.kubino.learning.Students.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("John");
        student.setStudentNumber(12345);

        System.out.println(student.getName() + ": " + student.getStudentNumber());
    }
}
