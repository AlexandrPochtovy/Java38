package com.company.exception;

public class WrongLoginException extends CharException {

    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
