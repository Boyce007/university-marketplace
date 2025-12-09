package com.danielboyce.university_marketplace_api.exceptions;

public class UniversityNotFoundException extends RuntimeException{

    public UniversityNotFoundException(String message) {
        super(message);
    }

}
