package com.cognixia.jump.menus;

import java.util.Scanner;

import com.cognixia.jump.DAO.CustomerDAOClass;
import com.cognixia.jump.utility.ConsolePrinterUtility;

public class LoginMenu {
    ConsolePrinterUtility msg = new ConsolePrinterUtility();
    CustomerDAOClass sqlCustomer = new CustomerDAOClass();


    public int login(Scanner sc) {

        System.out.println("UserId: ");
        String userId = sc.nextLine().trim().toLowerCase();

        try {
            int id = Integer.parseInt(userId);
            System.out.println("Password: ");
            String password = sc.nextLine().trim().toLowerCase();
            boolean request = sqlCustomer.checkLogIn(id, password);
            if(request){
                return id;
            }

        } catch (NumberFormatException e) {
            System.out.println("Please Enter UserID #");
            return 0;
        }
        return 0;

    };
}
