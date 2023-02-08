package com.cognixia.jump.application;

import java.util.Scanner;

import com.cognixia.jump.menus.NewCustomerMenu;
import com.cognixia.jump.utility.ConsolePrinterUtility;

public class DollarsBankApplication {
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        ConsolePrinterUtility msg = new ConsolePrinterUtility();
        NewCustomerMenu signUp = new NewCustomerMenu();

        while(true){
            msg.welcomeMessage();
            String ans = sc.nextLine().trim().toLowerCase();

            if(ans.equals("1")){
                // New Customer Info
                signUp.newCustomer(sc);
            }

            if(ans.equals("2")){
                // Login
            }

            if(ans.equals("3")){
                // Exit
                break;
            }
        }
        sc.close();

    }
}
