package com.pluralsight.finance;

public class CreditCard extends BankAccount {
    public CreditCard(String name, String accountNumber, double balance) {
        super(Integer.parseInt(name), accountNumber, balance);
    }

    public void charge(double amount) {

    }

    public void pay(double amount) {

    }
}
