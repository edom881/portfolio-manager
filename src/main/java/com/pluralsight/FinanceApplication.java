package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Gold;
import com.pluralsight.finance.House;
import com.pluralsight.finance.Jewelry;
import com.pluralsight.finance.Valuable;



public class FinanceApplication {

    public static void main(String[] args) {


        BankAccount account1 = new BankAccount(123, "Pam", 12500);
        Valuable account2 = new BankAccount(456, "Gary", 1500);

        Gold gold = new Gold(2.5);

        Jewelry ring = new Jewelry("Diamond Ring", 18);

        House house = new House("Family House", 2000, 350000);


        account1.deposit(100);

        System.out.println("Account 1 value: $" + account1.getValue());

        System.out.println("Account 2 value: $" + account2.getValue());

        System.out.println("Gold value: $" + gold.getValue());

        System.out.println("Jewelry value: $" + ring.getValue());

        System.out.println("House value: $" + house.getValue());
    }
}
