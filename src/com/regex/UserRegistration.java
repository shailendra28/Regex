package com.regex;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 * Program for UserRegistration
 * Validate first Name Using regex concept
 */
public class UserRegistration {
    private boolean check;
    private String firstName,lastName, email;
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
    //Declare Main Class
    public static void main(String args[]) {
        UserRegistration user = new UserRegistration();
        user.checkFirstName();//Calling checkFirstName
        user.checkLastName();//Calling checkLastName
        user.checkEmail();//Calling checkEmail
    }
}
