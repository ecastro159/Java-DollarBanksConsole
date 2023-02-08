package com.cognixia.jump.DAO;

import java.util.List;

import com.cognixia.jump.model.Customer;

public interface CustomerDAO {

    // Create new Customer
    public int createCustomer(Customer customer);
    // Check if Login information is correct userName and Password Match
    public boolean checkLogIn(String userName, String password);
    // Update Customer Information
    public Customer updateCustomer(Customer customer);

}
