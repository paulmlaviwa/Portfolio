package com.pluralsight.finance;

import pluralsight.Valuable;

class BankAccount implements Valuable {
    int accountNumber;
    String accountHolder;
    double balance;


    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into account #" + accountNumber);
    }


    @Override
    public double getValue() {
        return balance;
    }
}