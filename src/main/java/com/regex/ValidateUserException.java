package com.regex;
//Created Class for Exception
public class ValidateUserException extends Exception{
    enum ExceptionType {
        ENTERED_INVALID, ENTERED_NULL, ENTERED_EMPTY
    }
    ExceptionType type;
    // Creating a constructor of ValidateUserException and passing super message
    public ValidateUserException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
