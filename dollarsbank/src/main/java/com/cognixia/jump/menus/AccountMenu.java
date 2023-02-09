package com.cognixia.jump.menus;

import java.util.Scanner;

import com.cognixia.jump.DAO.AccountDAOClass;
import com.cognixia.jump.DAO.TransactionDAOClass;
import com.cognixia.jump.utility.ConsolePrinterUtility;

public class AccountMenu {

    ConsolePrinterUtility msg = new ConsolePrinterUtility();
    AccountDAOClass sqlBank = new AccountDAOClass();
    TransactionDAOClass sqlHistory = new TransactionDAOClass();
    TransactionHistoryMenu purchesList = new TransactionHistoryMenu();
    CustomerInfoMenu info = new CustomerInfoMenu();

    public void accountOptionMenu(Scanner sc, int userId) {
        while (true) {
            msg.accountOptionMenu();
            String ans = sc.nextLine().trim().toLowerCase();

            // Deposit to Account
            if (ans.equals("1")) {
                msg.pickAccount();
                deposit(sc, userId);
            }
            // Withdraw from Account
            if (ans.equals("2")) {
                msg.pickAccount();
                withdraw(sc, userId);

            }

            // Fund Transfer
            if (ans.equals("3")) {

                break;
            }

            // Transfer History
            if (ans.equals("4")) {
                purchesList.history(userId);
            }

            // Customer Info
            if (ans.equals("5")) {
                info.info(userId);
            }

            // Exist
            if (ans.equals("6")) {
                break;
            }

        }

    }

    public void deposit(Scanner sc, int userId) {
        String choose = sc.nextLine().trim().toLowerCase();
        System.out.println();
        if (choose.equals("1")) {
            msg.pickAmount();
            String amount = sc.nextLine().trim().toLowerCase();
            // Checks if Input is Double
            try {
                double money = Double.parseDouble(amount);
                double currentBalance = sqlBank.currentBalanceInChecking(userId);
                double newBalance = currentBalance + money;

                System.out.println("Successfully deposited $" + money);
                sqlBank.depositToChecking(userId, newBalance);

                sqlHistory.addToHistory(userId, "Deposit/Checking" ,money);

            } catch (Exception e) {
                System.out.println("Please Enter Amount in Dollars");
            }
        }

        if (choose.equals("2")) {
            msg.pickAmount();
            String amount = sc.nextLine().trim().toLowerCase();
            // Checks if Input is Double
            try {
                double money = Double.parseDouble(amount);
                double currentBalance = sqlBank.currentBalanceInSavings(userId);
                double newBalance = currentBalance + money;

                System.out.println("Successfully deposited $" + money);
                sqlBank.depositToSavings(userId, newBalance);

                sqlHistory.addToHistory(userId, "Deposit/Saving", money);

            } catch (Exception e) {
                System.out.println("Please Enter Amount in Dollars");
            }
        }

    }

    public void withdraw(Scanner sc, int userId) {
        String choose = sc.nextLine().trim().toLowerCase();
        System.out.println();
        if (choose.equals("1")) {
            msg.pickAmount();
            String amount = sc.nextLine().trim().toLowerCase();
            // Checks if Input is Double
            try {
                double money = Double.parseDouble(amount);
                double currentBalance = sqlBank.currentBalanceInChecking(userId);
                double newBalance = currentBalance - money;

                System.out.println("Successfully Withdrew $" + money);
                sqlBank.withdrawFromChecking(userId, newBalance);

                sqlHistory.addToHistory(userId, "Withdraw/Checking", money);

            } catch (Exception e) {
                System.out.println("Please Enter Amount in Dollars");
            }
        }

        if (choose.equals("2")) {
            msg.pickAmount();
            String amount = sc.nextLine().trim().toLowerCase();
            // Checks if Input is Double
            try {
                double money = Double.parseDouble(amount);
                double currentBalance = sqlBank.currentBalanceInSavings(userId);
                double newBalance = currentBalance - money;

                System.out.println("Successfully deposited $" + money);
                sqlBank.depositToSavings(userId, newBalance);

                sqlHistory.addToHistory(userId, "Withdraw/Saving", money);

            } catch (Exception e) {
                System.out.println("Please Enter Amount in Dollars");
            }
        }

    }
}
