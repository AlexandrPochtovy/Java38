package com.company.exception;

public class WrongPasswordException extends CharException {

    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
