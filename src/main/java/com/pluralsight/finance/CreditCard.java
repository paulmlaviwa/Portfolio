package com.pluralsight.finance;

public class CreditCard extends BankAccount {
    public CreditCard(int name, String accountNumber, double balance) {
        super(Integer.parseInt(String.valueOf(name)), accountNumber, balance);
    }

    public void charge(double amount) {

    }

    public void pay(double amount) {

    }
}
