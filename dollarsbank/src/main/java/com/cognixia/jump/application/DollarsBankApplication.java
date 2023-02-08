package com.cognixia.jump.application;

import java.util.Scanner;

import com.cognixia.jump.menus.AccountMenu;
import com.cognixia.jump.menus.LoginMenu;
import com.cognixia.jump.menus.NewCustomerMenu;
import com.cognixia.jump.utility.ConsolePrinterUtility;

public class DollarsBankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConsolePrinterUtility msg = new ConsolePrinterUtility();
        NewCustomerMenu signUp = new NewCustomerMenu();
        AccountMenu account = new AccountMenu();
        LoginMenu login = new LoginMenu();

        while (true) {
            msg.welcomeMessage();
            String ans = sc.nextLine().trim().toLowerCase();

            // New Customer Screen
            if (ans.equals("1")) {
                // New Customer Info
                signUp.newCustomer(sc);
            }
            // Login Screen
            if (ans.equals("2")) {
                // Login
                msg.loginScreen();

                int validLogIn = login.login(sc);
                if (validLogIn!=0) {
                    account.accountOptionMenu(sc, validLogIn);
                } 
            }
            // Exist Program
            if (ans.equals("3")) {
                // Exit
                break;
            }
        }
        sc.close();

    }
}
