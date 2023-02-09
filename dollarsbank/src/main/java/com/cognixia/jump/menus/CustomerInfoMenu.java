package com.cognixia.jump.menus;

import com.cognixia.jump.DAO.AccountDAOClass;
import com.cognixia.jump.DAO.CustomerDAOClass;
import com.cognixia.jump.model.Customer;

public class CustomerInfoMenu {


    CustomerDAOClass sqlCustomer = new CustomerDAOClass();
    AccountDAOClass sqlAccount = new AccountDAOClass();

    public void info(int userID){
        System.out.println();
        System.out.println("Your Information: ");
        // System.out.println(sqlCustomer.customerInfo(userID).toString());
        Customer customer = sqlCustomer.customerInfo(userID);
        System.out.println("User ID: "+ userID);
        System.out.println("First Name: "+ customer.getFirstName());
        System.out.println("Last Name: "+ customer.getLastName());
        System.out.println("Contact Number: "+ customer.getContactInfo());
        System.out.println("Password: "+ customer.getPassword());
        System.out.println();

        System.out.println("Balance in Checking: $"+ sqlAccount.currentBalanceInChecking(userID));
        System.out.println("Balance in Savings: $"+ sqlAccount.currentBalanceInSavings(userID));
        System.out.println();

    }
    
}
