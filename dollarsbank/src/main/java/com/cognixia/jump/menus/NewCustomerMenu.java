package com.cognixia.jump.menus;

import java.util.Scanner;

import com.cognixia.jump.DAO.CustomerDAO;
import com.cognixia.jump.DAO.CustomerDAOClass;
import com.cognixia.jump.model.Customer;
import com.cognixia.jump.utility.ConsolePrinterUtility;

public class NewCustomerMenu {
    ConsolePrinterUtility msg = new ConsolePrinterUtility();
    CustomerDAOClass sqlCustomer = new CustomerDAOClass();

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

        Customer customer = new Customer(FirstName, LastName, ContactInfo, Password);
        int created = sqlCustomer.createCustomer(customer);

        if (created != 0) {
            customer.setUserID(created);
            System.out.println("New Account was Created with the Following Info: ");
            System.out.println(customer.toString());
            System.out.println("Your Sign-In Credential are");
            System.out.println("UserID = " + customer.getUserID());
            System.out.println("Password: " + customer.getPassword());
        } else {
            System.out.println("User was not created");
        }

    }

}
