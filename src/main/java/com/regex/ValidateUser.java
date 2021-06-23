package com.regex;
import java.util.regex.Pattern;
/**
 * Program for UserRegistration with throws ValidateUserException, NullPointerException
 * for this operation i have imported regex module.
 * Test Case For firstName,lastName, email,phoneNumber,password
 */
public class ValidateUser {
    private static boolean match;
    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3,}$";
    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3,}$";
    private static final String EMAIL_PATTERN = "[0-9 a-z A-z]+([._+-][0-9 a-z A-Z]+)*" + "@([0-9 a-z A-Z][-]?)+[.][a-z A-Z]{2,4}([.][a-z A-Z]{2,4})?$";
    private static final String MOB_NUMBER = "^[1-9]{2}\\s{0,1}[0-9]{5}[0-9]{5}$";
    private static final String PASSWORD_RULE = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])(?=.*[@#$%^&-+_=]{1}).{8,}$";
    /**
     * This validateFirstName method will check the user input according to the pattern.
     * throws ValidateUserException, NullPointerException
     */
    Check validateFirstName = (String fname) -> {
        try {
            Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
            match = pattern.matcher(fname).matches();
            if (fname.length() == 0) {
                throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_EMPTY, "name can not be empty");
            } else if (!match) {
                throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_INVALID, "Enter name start with capital latter and min 3 char long");
            }
            return match;
        } catch (NullPointerException e) {
            throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_NULL, "please enter proper name");
        }
    };
    /**
     * This validateLastName method will check the user input according to the pattern.
     * throws ValidateUserException, NullPointerException
     */
    Check validateLastName = (String lname) -> {
        try {
            Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
            boolean match = pattern.matcher(lname).matches();
            if (lname.length() == 0) {
                throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_EMPTY, "Last name cannot be empty");
            } else if (!match) {
                throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_INVALID, "Enter name starts with capital latter and min 3 char long");
            }
        }
        catch (NullPointerException e) {
            throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_NULL, "Last name cannot be null");
        }
        return match;
    };
    /**
     * This validateEmail method will check the user input according to the pattern.
     * throws ValidateUserException, NullPointerException
     */
    Check validateEmail = (String email) ->  {
        try {
            Pattern pattern = Pattern.compile(EMAIL_PATTERN);
            match = pattern.matcher(email).matches();
            if (email.length() == 0) {
                throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_EMPTY, "email cannot be empty");
            }
            else if (!match) {
                throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_INVALID, "Enter proper email");
            }
        }
        catch (NullPointerException e) {
            throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_NULL, "Email cannot be empty");
        }
        return match;
    };
    /**
     * This validateMobNumber method will check the user input according to the pattern.
     * throws ValidateUserException, NullPointerException
     */
    Check validateMobNumber = (String mobnumber) -> {
        try {
            Pattern pattern = Pattern.compile(MOB_NUMBER);
            match = pattern.matcher(mobnumber).matches();
            if (mobnumber.length() == 0) {
                throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_EMPTY, "please enter mob no");
            }
            else if (!match) {
                throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_INVALID, "Enter proper 10 digit mobile number with country code");
            }
        }
        catch(NullPointerException e) {
            throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_NULL, "Number cannot be empty");
        }
        return match;
    };
    /**
     * This validatePassword method will check the user input according to the pattern.
     * throws ValidateUserException, NullPointerException
     */
    Check validatePassword= (String password) ->{
        try {
            Pattern pattern = Pattern.compile(PASSWORD_RULE);
            match = pattern.matcher(password).matches();
            if (password.length() == 0) {
                throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_EMPTY, "please enter password");
            }
            else if (!match) {
                throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_INVALID, "please enter valid password");
            }
        }
        catch(NullPointerException e) {
            throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_NULL, "Password cannot be null");
        }
        return match;
    };
}

