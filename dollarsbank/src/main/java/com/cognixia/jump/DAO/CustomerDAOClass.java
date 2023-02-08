package com.cognixia.jump.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cognixia.jump.model.Customer;
import com.cognixia.jump.utility.ConnectionManager;

public class CustomerDAOClass implements CustomerDAO {

    private Connection conn = ConnectionManager.getConnection();

    @Override
    public int createCustomer(Customer customer) {
        try {
            String sql = "INSERT into customer(customer_id, first_name, last_name, contact_number, user_password) values(?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
            pstmt.setNull(1, 0, null);
            pstmt.setString(2, customer.getFirstName());
            pstmt.setString(3, customer.getLastName());
            pstmt.setString(4, customer.getContactInfo());
            pstmt.setString(5, customer.getPassword());

            int i = pstmt.executeUpdate();
            ResultSet rs = pstmt.getGeneratedKeys();
            int generatedKey = 0;
            if (rs.next()) {
                generatedKey = rs.getInt(1);
                System.out.println("Inserted record's ID: " + generatedKey);
                return generatedKey;
            } else {
                System.out.println("Record was not inserted");
                return generatedKey;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public boolean checkLogIn(int userId, String password) {
        // int id = Integer.parseInt(userId);

        String sql = "SELECT customer_id, user_password FROM customer WHERE customer_id = ? and user_password = ?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, userId);
            pstmt.setString(2, password);

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                System.out.println("Welcome");
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Something Went wrong in SQL Statement");
            return false;
            // e.printStackTrace();
        }
        System.out.println("Incorrect Username/Password");
        System.out.println();
        return false;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        // TODO Auto-generated method stub
        return null;
    }

}
