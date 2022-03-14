package com.commerce.demo.ExceptionHandling;

import org.springframework.http.HttpStatus;

public abstract class BaseExceptionHandler extends RuntimeException {
    public BaseExceptionHandler() {
    }

    public BaseExceptionHandler(String message) {
        super(message);
    }

    public abstract HttpStatus getStatusCode();
}
