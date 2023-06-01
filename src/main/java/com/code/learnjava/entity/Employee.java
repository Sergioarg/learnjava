package com.code.learnjava.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "employee")
@NoArgsConstructor
public class Employee {

    // Fields
    @Id
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String emial;

    // Constructor
    public Employee(String firstName, String lastName, String emial) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emial = emial;
    }
}
