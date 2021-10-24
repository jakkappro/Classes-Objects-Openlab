package com.kubino.learning;

import com.kubino.learning.Job.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Employee person = new Employee("Jozko", "Mrkvicka", new Date(1990, 7, 4),
                new JobPosition("IT programmer", 2100));

        System.out.println(person.getFullName() + " " + person.getDateOfBirth().getDate() + "." +
                person.getDateOfBirth().getMonth() + "." + person.getDateOfBirth().getYear() + " " +
                person.getJobPosition().getName() + " " + person.getJobPosition().getSalary());
    }
}
