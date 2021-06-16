package com.regex;

import java.util.regex.Pattern;
/**
 * Program for UserRegistration
 * Test Case For firstName,lastName, email,phoneNumber,password(PASSWORDRULE1,PASSWORDRULE2,PASSWORDRULE3,PASSWORDRULE4
 */
public class ValidateUser {
    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3,}$";
    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3,}$";
    private static final String EMAIL_PATTERN= "[0-9 a-z A-z]+([._+-][0-9 a-z A-Z]+)*"+"@([0-9 a-z A-Z][-]?)+[.][a-z A-Z]{2,4}([.][a-z A-Z]{2,4})?$";
    private static final String MOB_NUMBER = "^[1-9]{2}\\s{0,1}[0-9]{5}[0-9]{5}$";
    private static final String PASSWORDRULE1 = "[a-z]{8}";
    private static final String PASSWORDRULE2 =  "[a-z A-Z]{8}";
    private static final String PASSWORDRULE3 = "[0-9 a-z A-Z]{8}";
    private static final String PASSWORDRULE4 = "^(?=.?[A-Z])(?=(.[a-z]){1,})(?=[.]{1,})(?=1,})(?!.*\\s).{8,}$";
    /**
     * This validateFirstName method will check the user input according to the pattern.
     * for this operation i have imported regex module.
     */
    public static boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(fname).matches();
        /**
         * This validateLastName method will check the user input according to the pattern.
         */
    }
    public static boolean validateLastName(String lname) {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lname).matches();

    }
    /**
     * Added validateEmail method to match the email ids according to the given pattern.
     */
    public static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }
    /**
     * This validateMobNumber method will check the user input(Mobile Number) according to the pattern.
     */
    public static boolean validateMobNumber(String mobnumber) {
        Pattern pattern = Pattern.compile(MOB_NUMBER);
        return pattern.matcher(mobnumber).matches();
    }
    /**
     * This validatePasswordRule1 method will check the user password1
     *.
     */
    public static boolean validatePasswordRule1(String password1) {
        Pattern pattern = Pattern.compile(PASSWORDRULE1);
        return pattern.matcher(password1).matches();
    }
    /**
     * This validatePasswordRule2 method will check the user password2
     *.
     */
    public static boolean validatePasswordrule2(String password2) {
        Pattern pattern = Pattern.compile(PASSWORDRULE2);
        return pattern.matcher(password2).matches();
    }
    /**
     * This validatePasswordRule3 method will check the user password3
     *.
     */
    public static boolean validatePasswordRule3(String password3) {
        Pattern pattern = Pattern.compile(PASSWORDRULE3);
        return pattern.matcher(password3).matches();
    }
    /**
     * This validatePasswordRule4 method will check the user password4
     *.
     */
    public static boolean validatePasswordRule4(String password4) {
        Pattern pattern = Pattern.compile(PASSWORDRULE4);
        return pattern.matcher(password4).matches();
    }
    /**
     * This validatefirstname method will check the user fname and return Happy or Sad
     *.
     */
    public static String validatefirstname(String fname) {
        String firstnamepattern = "^[A-Z]{1}[a-z]{3,}$";
        if (Pattern.matches(firstnamepattern, fname))
            return "Happy";
        else
            return "Sad";
    }
    /**
     * This validatelastname method will check the user lname and return Happy or Sad
     *.
     */
    public static String validatelastname(String lname) {
        String lastnamepattern = "^[A-Z]{1}[a-z]{3,}$";
        if (Pattern.matches(lastnamepattern, lname))
            return "Happy";
        else
            return "Sad";
    }
    /**
     * This validateemail method will check the user email according to pattern and return Happy or Sad
     *.
     */
    public static String validateemail(String email) {
        String emailnamepattern = "[0-9 a-z A-z]+([._+-][0-9 a-z A-Z]+)*"+"@([0-9 a-z A-Z][-]?)+[.][a-z A-Z]{2,4}([.][a-z A-Z]{2,4})?$";
        if (Pattern.matches(emailnamepattern, email))
            return "Happy";
        else
            return "Sad";
    }
    /**
     * This validatelMobNumber method will check the user mobnum according to pattern and return Happy or Sad
     *.
     */
    public static String validatelMobNumber(String mobnum) {
        String mobnumpattern = "^[1-9]{2}\\s{0,1}[0-9]{5}[0-9]{5}$";
        if (Pattern.matches(mobnumpattern, mobnum))
            return "Happy";
        else
            return "Sad";
    }
    /**
     * This validatPassword method will check the user password according to pattern and return Happy or Sad
     *.
     */
    public static String validatPassword(String password) {
        String Passwordpattern = "[0-9 a-z A-Z]{8}";
        if (Pattern.matches(Passwordpattern, password))
            return "Happy";
        else
            return "Sad";
    }
}
