package com.code.learnjava.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
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
        // Create array of Students
        theStudents = new ArrayList<>();

        // Add new students to the array
        theStudents.add(new Student("Jason", "Brody"));
        theStudents.add(new Student("Peter", "Parker"));
        theStudents.add(new Student("Eddie", "Brook"));
    }

    /**
     * @return Return all the students
     */
    @GetMapping(value="/students")
    public List<Student> getStudents() {
        return theStudents;
    }

    /**
     * Return student info by id
     * @param studentId student id
     * @return
     */
    @GetMapping(value="/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        if ((studentId >= theStudents.size()) || (studentId < 0)) {
            throw new StudentnNotFoundException("Student id not fount - " + studentId);
        }

        return theStudents.get(studentId);
    }

    // ? Add exception handler
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentnNotFoundException exc) {
        // Create a studentErrorResponse
        StudentErrorResponse error = new StudentErrorResponse();

        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<StudentErrorResponse>(error, HttpStatus.NOT_FOUND);
    }
}
