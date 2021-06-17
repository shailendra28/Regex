package com.regex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * Program for UserRegistration
 * Test Case For firstName,lastName, email,phoneNumber,password Using regex concept
 */
public class ValidateUserTest {
    //Test case for FirstName and return True
    @Test
    void givenFirstName_WhenProper_ShouldReturnTrue() {
        ValidateUser validator = new ValidateUser();
        try {
            boolean result = validator.validateFirstName("Shailendra");
            Assertions.assertEquals(true, result);
        } catch (ValidateUserException e) {
            e.printStackTrace();
        }
    }
    //Test case for FirstName and return InvalidName
    @Test
    public void givenFirstName_WhenShort_ShouldThrow_InvalidName() {
        ValidateUser validator = new ValidateUser();
        try {
            boolean result = validator.validateFirstName("Sh");
        }
        catch (ValidateUserException e) {
            System.out.println(e.type + " " + e.getMessage());
        }
    }
    //Test case for FirstName and return NullException
    @Test
    public void givenFirstName_WhenNull_ShouldThrowNullException() {
        ValidateUser validator = new ValidateUser();
        try {
            boolean result = validator.validateFirstName(null);
        }
        catch (ValidateUserException e) {
            System.out.println(e.type + " " + e.getMessage());
        }
    }
    //Test case for FirstName and return EmptyException
    @Test
    public void givenFirstName_WhenEmpty_ShouldThrow_EmptyException() {
        ValidateUser validator = new ValidateUser();
        try {
            boolean result = validator.validateFirstName("");
        }
        catch (ValidateUserException e) {
            System.out.println(e.type + " " + e.getMessage());
        }
    }
    //Test case for LastName and return True
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        try {
            ValidateUser validator = new ValidateUser();
            boolean result = validator.validateLastName("Yadav");
            Assertions.assertEquals(true, result);
        }
        catch (ValidateUserException e) {
            e.printStackTrace();
        }
    }
    //Test case for LastName and return InvalidName
    @Test
    public void givenLastName_WhenShort_ShouldThrow_InvalidName() {
        ValidateUser validator = new ValidateUser();
        try {
            boolean result = validator.validateLastName("Bho");
        }
        catch (ValidateUserException e) {
            System.out.println(e.type + " " + e.getMessage());
        }
    }
    //Test case for LastName and return NullException
    @Test
    public void givenLastName_WhenNull_ShouldThrowNullException() {
        ValidateUser validator = new ValidateUser();
        try {
            boolean result = validator.validateLastName(null);
        }
        catch (ValidateUserException e) {
            System.out.println(e.type + " " + e.getMessage());
        }
    }
    //Test case for LastName and return EmptyException
    @Test
    public void givenLastName_WhenEmpty_ShouldThrow_EmptyException() {
        ValidateUser validator = new ValidateUser();
        try {
            boolean result = validator.validateLastName("");
        }
        catch (ValidateUserException e) {
            System.out.println(e.type + " " + e.getMessage());
        }
    }
    //Test case for Email and return True
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        ValidateUser validator = new ValidateUser();
        try {
            boolean result = validator.validateEmail("abc.xyz@bl.co.in");
        }
        catch (ValidateUserException e) {
            e.printStackTrace();
        }
    }
    //Test case for Email and return InvalidEmail
    @Test
    public void givenEmail_WhenNotProper_ShouldThrow_InvalidEmail() {
        ValidateUser validator = new ValidateUser();
        try {
            boolean result = validator.validateEmail("swapnil.com");
        }
        catch (ValidateUserException e) {
            System.out.println(e.type + " " + e.getMessage());
        }
    }
    //Test case for Email and return NullException
    @Test
    public void givenEmail_WhenNull_ShouldThrowNullException() {
        ValidateUser validator = new ValidateUser();
        try {
            boolean result = validator.validateEmail(null);
        }
        catch (ValidateUserException e) {
            System.out.println(e.type + " " + e.getMessage());
        }
    }
    //Test case for Email and return EmptyException
    @Test
    public void givenEmail_WhenEmpty_ShouldThrow_EmptyException() {
        ValidateUser validator = new ValidateUser();
        try {
            boolean result = validator.validateEmail("");
        }
        catch (ValidateUserException e) {
            System.out.println(e.type + " " + e.getMessage());
        }
    }
    //Test case for MobNumber and return True
    @Test
    public void givenMobNumber_WhenProper_ShouldReturnTrue() {
        ValidateUser validator = new ValidateUser();
        try {
            boolean result = validator.validateMobNumber("91 8974563210");
        }
        catch (ValidateUserException e) {
            e.printStackTrace();
        }
    }
    //Test case for MobNumber and return InvalidMoNumber
    @Test
    public void givenMoNumber_WhenNotProper_ShouldThrow_InvalidMoNumber() {
        ValidateUser validator = new ValidateUser();
        try {
            boolean result = validator.validateMobNumber("4587");
        }
        catch (ValidateUserException e) {
            System.out.println(e.type + " " + e.getMessage());
        }
    }
    //Test case for MobNumber and return NullException
    @Test
    public void givenMoNumber_WhenNull_ShouldThrowNullException() {
        ValidateUser validator = new ValidateUser();
        try {
            boolean result = validator.validateMobNumber(null);
        }
        catch (ValidateUserException e) {
            System.out.println(e.type + " " + e.getMessage());
        }
    }
    //Test case for MobNumber and return EmptyException
    @Test
    public void givenMoNumber_WhenEmpty_ShouldThrow_EmptyException() {
        ValidateUser validator = new ValidateUser();
        try {
            boolean result = validator.validateMobNumber("");
        }
        catch (ValidateUserException e) {
            System.out.println(e.type + " " + e.getMessage());
        }
    }
    //Test case for Password and return True
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        ValidateUser validator = new ValidateUser();
        try {
            boolean result = validator.validatePassword("Eyu6@uyh");
            Assertions.assertEquals(true, result);
        }
        catch (ValidateUserException e) {
            e.printStackTrace();
        }
    }
    //Test case for Password and return InvalidPassword
    @Test
    public void givenPassword_WhenNotProper_ShouldThrow_InvalidPassword() {
        ValidateUser validator = new ValidateUser();
        try {
            boolean result = validator.validatePassword("4587");
        }
        catch (ValidateUserException e) {
            System.out.println(e.type + " " + e.getMessage());
        }
    }
    //Test case for Password and return NullException
    @Test
    public void givenPassword_WhenNull_ShouldThrowNullException() {
        ValidateUser validator = new ValidateUser();
        try {
            boolean result = validator.validatePassword(null);
        }
        catch (ValidateUserException e) {
            System.out.println(e.type + " " + e.getMessage());
        }
    }
    //Test case for Password and return EmptyException
    @Test
    public void givenPassword_WhenEmpty_ShouldThrow_EmptyException() {
        ValidateUser validator = new ValidateUser();
        try {
            boolean result = validator.validatePassword("");
        }
        catch (ValidateUserException e) {
            System.out.println(e.type + " " + e.getMessage());
        }
    }
}

