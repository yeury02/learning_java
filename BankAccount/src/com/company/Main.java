package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalence(100);
        System.out.println("account balance = " + bankAccount.getBalence());
        bankAccount.addFunds(50);
        System.out.println("account balance = " + bankAccount.getBalence());
        bankAccount.withdrawFunds(150);
        System.out.println("account balance = " + bankAccount.getBalence());
        bankAccount.withdrawFunds(100);
    }
}
