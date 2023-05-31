package com.code.learnjava.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.learnjava.entity.Student;

import jakarta.annotation.PostConstruct;


@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    // Define @PostContruct to load the student data...only one.
    @PostConstruct
    public void loadData() {
        theStudents = new ArrayList<>();

        theStudents.add(new Student("Jason", "Brody"));
        theStudents.add(new Student("Peter", "Parker"));
        theStudents.add(new Student("Eddie", "Brook"));
    }


    @GetMapping(value="/students")
    public List<Student> getStudents() {
        // Create array of Students
        // Add new students to the array
        return theStudents;
    }


    @GetMapping(value="/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        // Create array of Students
        // Add new students to the array
        return theStudents.get(studentId);
    }
}
