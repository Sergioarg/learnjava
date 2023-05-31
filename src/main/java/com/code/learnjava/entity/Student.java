package com.code.learnjava.entity;

import lombok.Data;

@Data // This annotation create the getter and setters
public class Student {

    private String fistName;
    private String lastName;

    // Contructor
    public Student(String fistName, String lastName) {
        this.fistName = fistName;
        this.lastName = lastName;
    }
}
