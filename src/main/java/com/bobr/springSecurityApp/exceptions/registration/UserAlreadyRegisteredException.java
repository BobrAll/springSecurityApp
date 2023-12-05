package com.bobr.springSecurityApp.exceptions.registration;

public class UserAlreadyRegisteredException extends RuntimeException {
    public UserAlreadyRegisteredException() {
        super("User already exist");
    }
}
