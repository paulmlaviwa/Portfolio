package com.pluralsight.finance;

import pluralsight.Valuable;

public class FinanceApplication {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123, "Pam", 12500);

        Valuable account2 = (Valuable) new BankAccount(456, "Gary", 1500);

        account1.deposit(100);
    }
}

