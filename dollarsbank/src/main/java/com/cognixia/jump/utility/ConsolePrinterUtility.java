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
        System.out.println(menu.length());
        System.out.println();

        System.out.println("User ID: ");
        System.out.println("Password: ");

    }
}
