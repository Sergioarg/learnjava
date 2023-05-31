package com.code.learnjava.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.learnjava.entity.Student;


@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping(value="/students")
    public List<Student> getStudents() {
        // Create array of Students
        List<Student> theStudents = new ArrayList<>();
        // Add new students to the array
        theStudents.add(new Student("Jason", "Brody"));
        theStudents.add(new Student("Peter", "Parker"));
        theStudents.add(new Student("Eddie", "Brook"));

        return theStudents;
    }
}
