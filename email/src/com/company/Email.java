package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int defaultPasswordLen = 10;
    private String email;
    private String companySuffix = "company.com"; // company.com could be replaced with an actual company name

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("first name: " + this.firstName + "\nlast Name: " + this.lastName);

        // determine the department, ask user to choose one and return it
        this.department = setDepartment();

        // determine the password, generate a random password
        this.password = randomPassword(defaultPasswordLen);

        // combine elements to generate emails
        email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() +
                "@" + this.department + "." + companySuffix;
        System.out.println("your email is: " + email);

    }
    // determine department
    private String setDepartment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDepartment CODES:\n");
        System.out.println("1 for Sales");
        System.out.println("2 for Development");
        System.out.println("3 for Accounting");
        System.out.println("0 for None");
        System.out.println("\nEnter a number for a department code: ");
        int userChoice = scanner.nextInt();
        if (userChoice == 1) {return "sales"; }
        else if (userChoice == 2) {return "dev"; }
        else if (userChoice == 3) {return "acct"; }
        // if user choice is any number other than 1-2-3
        else {return ""; }
    }
    // determine password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
}
