package com.regex;
@FunctionalInterface
public interface Check {
    boolean check(String value) throws ValidateUserException;
}
