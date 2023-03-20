package com.cognixia.jump.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cognixia.jump.model.AccountTransaction;
import com.cognixia.jump.utility.ConnectionManager;

public class TransactionDAOClass implements TransactionDAO{

    private Connection conn = ConnectionManager.getConnection();

    @Override
    public void addToHistory(int userId, String transactionType, double amount) {
        String sql = "INSERT INTO TransactionHistory(account_id, customer_id, transaction_type, amount, access_time) values(?,?,?,?,?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setNull(1, 0, null);
            pstmt.setInt(2, userId);
            pstmt.setString(3, transactionType);
            pstmt.setDouble(4, amount);
            pstmt.setNull(5, 0, null);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public List<AccountTransaction> getLastFiveTransaction(int userID) {

        String sql = "select * from TransactionHistory where customer_id = ? ORDER BY account_id DESC LIMIT 5";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, userID);

            List<AccountTransaction> transactionList = new ArrayList<AccountTransaction>();

            ResultSet rs = pstmt.executeQuery();

            while(rs.next()){
                int id = rs.getInt("account_id");
                int userId = rs.getInt("customer_id");
                String type = rs.getString("transaction_type");
                double amount = rs.getDouble("amount");
                

                AccountTransaction transactionHis = new AccountTransaction(id, userId, type, amount);
                transactionList.add(transactionHis);
                // System.out.println("Entry added");
            }
            return transactionList;
            
            
            
        } catch (SQLException e) {
            
            System.out.println("Could not retrive List");
            e.printStackTrace();
        }
    
        return null;
    }

    
    
}
