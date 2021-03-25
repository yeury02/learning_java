package com.company;

import java.util.Scanner;

public class Account {
    // class variables
    private double balance = 0;
    private double previousTransaction = 0;
    private final String customerName;
    private final String customerID;

    public Account(String customerName, String customerID) {
        this.customerName = customerName;
        this.customerID = customerID;
    }

    public double getBalance() {
        return balance;
    }

    public void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            // used math library to get the positive value of what was withdrawn
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        }
    }

    public void deposit(double amount) {
        if (amount != 0) {
            balance += amount;
            previousTransaction = amount;
        }
    }

    public void withdraw(int amount) {
        if (amount != 0) {
            balance -= amount;
            previousTransaction = -amount; // negative amount as it is withdrawn
        }
    }

    public void showMenu() {
        char option; // this variable will be used to keep track of the user ch
        // create scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome " + customerName + "!");
        System.out.println("your ID is " + customerID + "\n");
        System.out.println("What kind of transaction would you like to do?\n");
        System.out.println("A. Check your balance");
        System.out.println("B. Make a deposit");
        System.out.println("C. Make a withdraw");
        System.out.println("D. View previous transaction");
        System.out.println("E. Exit");

        do {
            System.out.println();
            System.out.println("Enter a valid ch (in upper case letter)");
            // grab next character
            char option1 = scanner.next().charAt(0);
            option = Character.toUpperCase(option1);
            System.out.println();

            switch (option) {
                // case 'A' allows user to check account balance
                case 'A':
                    System.out.println("###################");
                    System.out.println("Balance = $" + balance);
                    System.out.println("###################\n");
                    break;
                // case 'B' allows the user to deposit money into their account
                case 'B':
                    System.out.println("Enter an amount to deposit: ");
                    // grabs amount user inputs
                    double amount = scanner.nextDouble();
                    deposit(amount);
                    System.out.println();
                    break;
                // case 'C' allows user to withdraw money from account
                case 'C':
                    System.out.println("Enter an amount to withdraw: ");
                    // grabs amount user inputs
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println();
                    break;
                // allows users to view their most recent transaction
                case 'D':
                    System.out.println("###################");
                    getPreviousTransaction();
                    System.out.println("###################\n");
                    break;
                // this option is meant to allow users to quit after doing all transactions
                case 'E':
                    System.out.println("###################");
                    break;
                // the default case let's use use know that they entered an invalid character
                default:
                    System.out.println("Error: invalid option. Please enter a character from the menu");
                    break;
            }
        } while (option != 'E');
        System.out.println();
        System.out.println("Thank you for banking with us");
    }
}
