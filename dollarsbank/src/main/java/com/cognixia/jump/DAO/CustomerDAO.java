package com.cognixia.jump.DAO;

import java.util.List;

import com.cognixia.jump.model.Customer;

public interface CustomerDAO {

    // Create new Customer
    public int createCustomer(Customer customer);
    // Check if Login information is correct userName and Password Match
    public boolean checkLogIn(int userName, String password);

    // Find Customer by id
    public Customer foundCustomer(int userID);
    // Update Customer Information
    public Customer updateCustomer(Customer customer);

}
