
package com.pluralsight;

import com.pluralsight.finance.Portfolio;
import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Gold;
import com.pluralsight.finance.Jewelry;
import com.pluralsight.finance.House;

public class FinanceApplication {

    public static void main(String[] args) {


        Portfolio portfolio = new Portfolio("Retirement Portfolio", "Pam");

        BankAccount account1 = new BankAccount(123, "Pam", 12500);

        Gold gold = new Gold(2.5);

        Jewelry ring = new Jewelry("Diamond Ring", 18);

        House house = new House("Family House", 2000, 350000);

        portfolio.add(account1);
        portfolio.add(gold);
        portfolio.add(ring);
        portfolio.add(house);

        System.out.println("Total Portfolio Value: $" + portfolio.getValue());

        System.out.println("Most Valuable Asset: $" +
                portfolio.getMostValuable().getValue());

        System.out.println("Least Valuable Asset: $" +
                portfolio.getLeastValuable().getValue());
    }  }

