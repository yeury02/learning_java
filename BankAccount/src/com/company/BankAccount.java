package com.company;

// practicing using getters and setters
// creating objects and working with classes
public class BankAccount {
    // declaring this values as ints for simplicity
    private int accountNumber;
    private int balance;
    private String name;

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public int getBalence() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalence(int balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int addFunds(int amountToAdd) {
        return this.balance += amountToAdd;
    }

    public int withdrawFunds(int amountToWithdraw) {
        int amountLeftInAccount = this.balance - amountToWithdraw;
        if (amountLeftInAccount < 0) {
            System.out.println("You do not have the amount requested to withdraw");
            return -1;
        } else {
            return this.balance -= amountToWithdraw;
        }
    }
}
