package com.code.learnjava.rest;

import lombok.Data;

@Data
public class StudentErrorResponse {
    private int status;
    private String message;
    private long timeStamp;

    // Constructor
    public StudentErrorResponse(int status, String message, long timeStamp) {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public StudentErrorResponse() {
    }
}
