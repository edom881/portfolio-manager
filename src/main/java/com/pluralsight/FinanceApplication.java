package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Valuable;

public class FinanceApplication {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(123, "Pam", 12500);
        Valuable account2 = new BankAccount(456, "Gary", 1500);

        account1.deposit(100);

        // This will NOT work because account2 is stored as Valuable
        // account2.deposit(100);

        System.out.println("Account 1 value: " + account1.getValue());
        System.out.println("Account 2 value: " + account2.getValue());
    }
}
