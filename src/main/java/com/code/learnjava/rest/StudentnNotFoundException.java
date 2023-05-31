package com.code.learnjava.rest;

// Create a custom error response class
public class StudentnNotFoundException extends RuntimeException {
    // Generate contructors from Superclass
    public StudentnNotFoundException(String message) {
        super(message);
    }

    public StudentnNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentnNotFoundException(Throwable cause) {
        super(cause);
    }
}
