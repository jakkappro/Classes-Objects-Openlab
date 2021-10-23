package com.kubino.learning;

import com.kubino.learning.Students.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();

        student.setName("John");
        student.setStudentNumber(12345);
        student.setAddress("ahoj");
        student.setPhoneNumber(123456789);

        student.setName("Sam");
        student.setStudentNumber(54321);
        student.setAddress("joha");
        student.setPhoneNumber(987654321);

        System.out.println(student.getStudentNumber() + ", " + student.getPhoneNumber() + ", " + student.getAddress());

        System.out.println(student1.getStudentNumber() + ", " + student1.getPhoneNumber() + ", " + student1.getAddress());
    }
}
