package com.cognixia.jump.utility;


public class ConsolePrinterUtility {

    public void welcomeMessage(){
        String welcomeMessage = "| Welcome to Random Bank |";
        int length = welcomeMessage.length();

        System.out.println(padding(length));
        System.out.println(welcomeMessage);
        System.out.println(padding(length));

        System.out.println("1. Create New Account");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        System.out.println();

        
    }

    public String padding(int length){
        String pad = "";
        for (int i = 0; i < length; i++) {
            pad += "*";
        }

        return pad;
    }

    public void newCustomer(){
        String msg = "| Enter Details For New Account |";
        System.out.println(padding(msg.length()));
        System.out.println(msg);
        System.out.println(padding(msg.length()));

    }

    public void loginScreen(){
        String menu = "| Please Enter your login your Information |";
        System.out.println(padding(menu.length()));
        System.out.println(menu);
        System.out.println(padding(menu.length()));
        System.out.println();

    }

    public void accountOptionMenu(){
        String menu = "| Welcome Valued Customer |";
        System.out.println(padding(menu.length()));
        System.out.println(menu);
        System.out.println(padding(menu.length()));
        System.out.println();

        System.out.println("1: Deposit Amount");
        System.out.println("2: Withdraw Amount");
        System.out.println("3: Fund Transfer");
        System.out.println("4: View Past 5 Transfers");
        System.out.println("5: Display Customer Information");
        System.out.println("6: Log out");
    }


    public void pickAccount(){
        System.out.println("Pick from the following accounts: ");
        System.out.println("1: Checking Account");
        System.out.println("2: Savings Account");
    }


    public void invalidOption(){
        System.out.println("Please choose one of the options listed");
    }
}
