package com.cognixia.jump.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cognixia.jump.utility.ConnectionManager;

public class AccountDAOClass implements AccountDAO {

    private Connection conn = ConnectionManager.getConnection();

    @Override
    public double currentBalanceInChecking(int account_id) {
        String sql = "SELECT checking_account FROM Account WHERE customer_id = ?";
        try {
            double amount = 0;
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, account_id);


            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                amount = rs.getDouble("checking_account");
            }
            
            return amount;
            

        } catch (SQLException e) {
            System.out.println("Invalid SQL Statement");
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public double currentBalanceInSavings(int account_id) {
        // TODO Auto-generated method stub


        return 0;
    }

    @Override
    public void depositNewAccount(int account_id, double amount) {
        // TODO Auto-generated method stub

        String sql = "INSERT INTO Account(account_id,customer_id,savings_account,checking_account) values(?,?,?,?)";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setNull(1, 0);
            pstmt.setInt(2, account_id);
            pstmt.setDouble(3, 0);
            pstmt.setDouble(4, amount);

            int rs = pstmt.executeUpdate();
            if(rs ==1){
                System.out.println("Added Initial Deposit");
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("Something went wrong!!!!");
            e.printStackTrace();
        }
        
        
    }
    
    @Override
    public void deposit(int account_id, double amount, int accountType) {
        // TODO Auto-generated method stub



    }

    @Override
    public void withdraw(int account_id, double amount) {
        // TODO Auto-generated method stub

    }

    @Override
    public void transfer(int account_id, double amount) {
        // TODO Auto-generated method stub

    }

}
