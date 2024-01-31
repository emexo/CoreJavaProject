package com.emexo.exception;

public class ApplicationNotFoundException extends Exception{
    public ApplicationNotFoundException() {
       super();
    }

    public ApplicationNotFoundException(String message) {
        super(message);
    }
    public ApplicationNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }


    public ApplicationNotFoundException(Throwable cause) {
        super(cause);
    }

}
