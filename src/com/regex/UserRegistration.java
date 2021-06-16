package com.regex;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 * Program for UserRegistration
 * Validate firstName,lastName, email,phoneNumber,password Using regex concept
 */
public class UserRegistration {
    private boolean check;
    private String firstName,lastName, email,phoneNumber,password;
    Scanner sc = new Scanner(System.in);
    public void checkFirstName() {
        System.out.println("enter first name starts with capital with minimum Three character : ");
        firstName = sc.nextLine();
        //check whether the enter first name matches the pattern
        check = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(firstName).matches();
        if (!check) {
            System.out.println(" first name is invalid ");
            checkFirstName();
        } else {
            System.out.println(" first name is valid ");
        }
    }
        public void checkLastName() {
            System.out.println("enter Last name starts with capital with minimum Three character : ");
            lastName = sc.nextLine();
            //check whether the enter Last name matches the pattern
            check = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(lastName).matches();
            if (!check) {
                System.out.println(" last name is invalid ");
                checkLastName();
            }
            else
                System.out.println(" last name is valid ");
        }
        public void checkEmail() {
             System.out.println("enter a valid email(Eg. abc.xyz@bl.co.in) : ");
             email = sc.nextLine();
             //check whether the enter Email valid or not
             check = Pattern.compile("^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]{2,}+)*$").matcher(email).matches();
             if (!check) {
            System.out.println(" email is invalid ");
            checkEmail();
        }
        else {
            System.out.println(" email is valid ");
        }
    }
        public void checkPhoneNumber() {
            System.out.println("enter a valid mobile number (Eg. 91 9919819801) : ");
            phoneNumber = sc.nextLine();
            //check whether the enter phoneNumber valid or not
            check = Pattern.compile("^[0-9]{1,3} [0-9]{10}$").matcher(phoneNumber).matches();
            if (!check) {
            System.out.println(" phone number is invalid ");
            checkPhoneNumber();
        }
            else {
            System.out.println(" phone number is valid ");
        }
    }
    public void checkPassword() {
        System.out.println("enter password(8 to 10 character): ");
        password = sc.nextLine();
        //check whether the enter password valid or not
        check = Pattern.compile("^[a-z]{8,}$").matcher(password).matches();
        if (!check) {
            System.out.println(" password invalid ");
            checkPassword();
        }
        else {
            System.out.println(" password valid ");
        }
    }

    //Declare Main Class
    public static void main(String args[]) {
        UserRegistration user = new UserRegistration();
        user.checkFirstName();//Calling checkFirstName
        user.checkLastName();//Calling checkLastName
        user.checkEmail();//Calling checkEmail
        user.checkPhoneNumber();//Calling checkPhoneNumber
        user.checkPassword();//Calling checkPassword
    }
}
