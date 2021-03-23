package com.company;

import java.util.Scanner;

public class Account {
    // class variables
    private double balance;
    private final String customerName;
    private final String customerID;

    public Account(String customerName, String customerID) {
        this.customerName = customerName;
        this.customerID = customerID;
    }

    public void showMenu() {
        // create scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome " + customerName + "!");
        System.out.println("your ID is " + customerID + "\n");
        System.out.println("What kind of transaction would you like to do?\n");
        System.out.println("A. Check your balance");
        System.out.println("B. Make a deposit");
        System.out.println("C. Make a withdrawl");
        System.out.println("D. View previous transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("Enter a valid option (in upper case letter)");
            // grab next character
            char ch = scanner.next().charAt(0);
            if (ch >= 97 && ch <= 123) {
                // handles user mistake --> turn char to upper case
                ch = Character.toUpperCase(ch);
            }
            else if (ch >= 48 && ch <= 57) {
                System.out.println("Wrong Input -- must be a valid letter\n");
            }
        } while (ch != 'F');
        System.out.println("Thank you for banking with us");


    }


}
