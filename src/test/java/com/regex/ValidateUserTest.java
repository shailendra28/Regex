package com.regex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * Program for UserRegistration
 * Test Case For firstName,lastName, email,phoneNumber,password(uppercase,NumericNumber,special char) Using regex concept
 */
public class ValidateUserTest {
    //Test case for FirstName and return True
    @Test
    void givenFirstName_WhenProper_ShouldReturnTrue() {
        ValidateUser validator = new ValidateUser();
        boolean result = ValidateUser.validateFirstName("Shailendra");
        Assertions.assertEquals(true, result);
    }
    //Test case for FirstName and return False
    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        ValidateUser validator = new ValidateUser();
        boolean result = ValidateUser.validateFirstName("Sh");
        Assertions.assertEquals(false, result);
    }
    //Test case for LastName and return True
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        ValidateUser validator = new ValidateUser();
        boolean result = ValidateUser.validateLastName("Yadav");
        Assertions.assertEquals(true,result);
    }
    //Test case for LastName and return false
    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        ValidateUser validator = new ValidateUser();
        boolean result = ValidateUser.validateLastName("Sha");
        Assertions.assertEquals(false,result);
    }
    //Test case for email and return True
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        ValidateUser validator = new ValidateUser();
        boolean result = ValidateUser.validateEmail("abc.xyz@bl.co.in");
        Assertions.assertEquals(true,result);
    }
    //Test case for MobNumber and return true
    @Test
    public void givenMobNumber_WhenProper_ShouldReturnTrue() {
        ValidateUser validator = new ValidateUser();
        boolean result = ValidateUser.validateMobNumber("91 8779796556");
        Assertions.assertEquals(true,result);
    }
    //Test case for MobNumber and return False
    @Test
    public void givenMobNumber_WhenDifferent_ShouldReturnFalse() {
        ValidateUser validator = new ValidateUser();
        boolean result = ValidateUser.validateMobNumber("91 87mj88B886");
        Assertions.assertEquals(false, result);
    }
    //Test case for PasswordRule1 and return True
    @Test
    public void givenPasswordRule1_WhenProper_ShouldReturnTrue() {
        ValidateUser validator = new ValidateUser();
        boolean result = ValidateUser.validatePasswordRule1("mkijhgtr");
        Assertions.assertEquals(true,result);
    }
    //Test case for PasswordRule2 and return True
    @Test
    public void givenPasswordRule2_WhenProper_ShouldReturnTrue(){
        ValidateUser validator = new ValidateUser();
        boolean result = ValidateUser.validatePasswordrule2("Ghutkytf");
        Assertions.assertEquals(true,result);
    }
    //Test case for PasswordRule3 and return True
    @Test
    public void givenPasswordRule3_WhenProper_ShouldReturnTrue() {
        ValidateUser validator = new ValidateUser();
        boolean result = ValidateUser.validatePasswordRule3("jdF5iOj8");
        Assertions.assertEquals(true, result);
    }
    //Test case for PasswordRule4 and return False
    @Test
    public void givenPasswordRule4_WhenProper_ShouldReturnFalse() {
        ValidateUser validator = new ValidateUser();
        boolean result = ValidateUser.validatePasswordRule4("Eyu6@uyh");
        Assertions.assertEquals(false,result);
    }
    //Test case for firstname and return Happy
    @Test
    public void givenFirstName_WhenProper_ShouldReturnHappy() {
        ValidateUser validator = new ValidateUser();
        String result = ValidateUser.validatefirstname("Shailendra");
        Assertions.assertEquals("Happy", result);
    }
    //Test case for firstname and return Sad
    @Test
    public void givenFirstName_WhenShort_ShouldReturnSad() {
        ValidateUser validator = new ValidateUser();
        String result = ValidateUser.validatefirstname("Sh");
        Assertions.assertEquals("Sad", result);
    }
    //Test case for lastname and return Happy
    @Test
    public void givenLastName_WhenProper_ShouldReturnHappy() {
        ValidateUser validator = new ValidateUser();
        String result = ValidateUser.validatelastname("Yadav");
        Assertions.assertEquals("Happy", result);
    }
    //Test case for lastname and return Sad
    @Test
    public void givenLastName_WhenShort_ShouldReturnSad() {
        ValidateUser validator = new ValidateUser();
        String result = ValidateUser.validatelastname("Yad");
        Assertions.assertEquals("Sad", result);
    }
    //Test case for email return Happy
    @Test
    public void givenEmail_WhenProper_ShouldReturnHappy() {
        ValidateUser validator = new ValidateUser();
        String result = ValidateUser.validateemail("abc.xyz@bl.co.in");
        Assertions.assertEquals("Happy", result);
    }
    //Test case for email return Sad
    @Test
    public void givenEmail_WhenNotProper_ShouldReturnSad() {
        ValidateUser validator = new ValidateUser();
        String result = ValidateUser.validateemail("ascffrg");
        Assertions.assertEquals("Sad", result);
    }
    //Test case for MobNumber return Sad
    @Test
    public void givenMobNumber_WhenNotProper_ShouldReturnSad() {
        ValidateUser validator = new ValidateUser();
        String result = ValidateUser.validatelMobNumber("9969550645");
        Assertions.assertEquals("Sad", result);
    }
    //Test case for Password return Happy
    @Test
    public void givenPassword_WhenProper_ShouldReturnHappy() {
        ValidateUser validator = new ValidateUser();
        String result = ValidateUser.validatPassword("A6rtr59k");
        Assertions.assertEquals("Happy", result);
    }
    //Test case for Password return Sad
    @Test
    public void givenPassword_WhenNotProper_ShouldReturnSad() {
        ValidateUser validator = new ValidateUser();
        String result = ValidateUser.validatPassword("bb@tr699k");
        Assertions.assertEquals("Sad", result);
    }
}
