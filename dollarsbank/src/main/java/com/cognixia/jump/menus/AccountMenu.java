package com.cognixia.jump.menus;

import java.util.Scanner;


import com.cognixia.jump.utility.ConsolePrinterUtility;

public class AccountMenu {

    ConsolePrinterUtility msg = new ConsolePrinterUtility();

    public void accountOptionMenu(Scanner sc, int validLogIn){
        msg.accountOptionMenu();
        String ans = sc.nextLine().trim().toLowerCase();
        while(true){
            // Deposit to Account
            if(ans.equals("1")){
                msg.pickAccount();
                deposit(sc);

            }
            // Withdraw from Account
            if(ans.equals("2")){
                msg.pickAccount();
                
            }

            // Fund Transfer
            if(ans.equals("3")){
                
                break;
            }

            // Transfer History
            if(ans.equals("4")){

            }

            // Customer Info
            if(ans.equals("5")){
                
            }

            // Exist
            if(ans.equals("6")){
                break;
            }

        }

    }



    public void deposit(Scanner sc){
        String ans = sc.nextLine().trim().toLowerCase();
        int account = Integer.parseInt(ans);
        if(account == 1){
            msg.pickAmount();
            String amount = sc.nextLine().trim().toLowerCase();
            try {
                double money = Double.parseDouble(amount);
                
            } catch (Exception e) {
                System.out.println("Please Enter Amount in Dollars");
            }
        }
    }
    
}
