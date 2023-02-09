package com.cognixia.jump.model;

import java.util.zip.DataFormatException;

public class AccountTransaction {
    // Amount
    private int transactionID;
    private int userID;
    private String transaction_type;
    private double amount;
    public int getTransactionID() {
        return transactionID;
    }
    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }
    public int getUserID() {
        return userID;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }
    public String getTransaction_type() {
        return transaction_type;
    }
    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public AccountTransaction() {
    }

    public AccountTransaction(int transactionID, int userID, String transaction_type, double amount) {
        this.transactionID = transactionID;
        this.userID = userID;
        this.transaction_type = transaction_type;
        this.amount = amount;
    }
    @Override
    public String toString() {
        return "AccountTransaction [transactionID: " + transactionID + ", userID: " + userID + ", transaction_type: "
                + transaction_type + ", amount: " + amount + "]";
    }

    


}
