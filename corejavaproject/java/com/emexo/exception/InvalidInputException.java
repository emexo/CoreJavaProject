package com.emexo.exception;

public class InvalidInputException extends Exception{
    public InvalidInputException(){
        super();
    }

    public InvalidInputException(String msg){
        super(msg);
    }

    public InvalidInputException(String msg, Throwable t){
        super(msg, t);
    }
}
