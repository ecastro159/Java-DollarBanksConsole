package com.cognixia.jump.menus;

import java.util.Scanner;

import com.cognixia.jump.DAO.AccountDAOClass;
import com.cognixia.jump.DAO.CustomerDAOClass;
import com.cognixia.jump.model.Customer;
import com.cognixia.jump.utility.ConsolePrinterUtility;

public class NewCustomerMenu {
    ConsolePrinterUtility msg = new ConsolePrinterUtility();
    CustomerDAOClass sqlCustomer = new CustomerDAOClass();
    AccountDAOClass sqlBank = new AccountDAOClass();

    public void newCustomer(Scanner sc) {
        msg.newCustomer();
        System.out.println("Enter First Name: ");
        String FirstName = sc.nextLine().trim().toLowerCase();

        System.out.println("Enter Last Name: ");
        String LastName = sc.nextLine().trim().toLowerCase();

        System.out.println("Contact Number: ");
        String ContactInfo = sc.nextLine().trim().toLowerCase();

        System.out.println("Password: ");
        String Password = sc.nextLine().trim().toLowerCase();

        System.out.println("Initial Deposit");
        System.out.print("$");
        String amount = sc.nextLine().trim().toLowerCase();
        double money = Double.parseDouble(amount);
        System.out.println();
        System.out.println();


        Customer customer = new Customer(FirstName, LastName, ContactInfo, Password);
        int created = sqlCustomer.createCustomer(customer);
        sqlBank.depositNewAccount(created, money);
        double balance = sqlBank.currentBalanceInChecking(created);

        if (created != 0) {
            customer.setUserID(created);
            System.out.println();
            System.out.println("New Account was Created with the Following Info: ");
            System.out.println(customer.toString());
            System.out.println("Balance in Checking Account: $"+ balance);
            System.out.println();
            System.out.println("Your Sign-In Credentials are");
            System.out.println("UserID = " + customer.getUserID());
            System.out.println("Password: " + customer.getPassword());
            System.out.println();
        } else {
            System.out.println("User was not created");
        }

    }

}
