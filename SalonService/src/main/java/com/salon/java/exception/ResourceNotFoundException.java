package com.salon.java.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String s) {
        super(s);

    }
    public ResourceNotFoundException(){
        super("Resource Not found Exception");
    }
}
