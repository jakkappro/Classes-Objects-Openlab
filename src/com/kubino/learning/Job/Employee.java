package com.kubino.learning.Job;

import java.util.Date;

public class Employee {
    private String name;
    private String surname;
    private Date dateOfBirth;
    private JobPosition jobPosition;


    public Employee(String name, String surname, Date dateOfBirth, JobPosition jobPosition) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.jobPosition = jobPosition;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public JobPosition getJobPosition() {
        return jobPosition;
    }
}
