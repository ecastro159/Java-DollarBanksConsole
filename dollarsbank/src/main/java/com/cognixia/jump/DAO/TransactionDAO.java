package com.cognixia.jump.DAO;

import java.util.List;

import com.cognixia.jump.model.AccountTransaction;

public interface TransactionDAO{
    public void addToHistory(int userId, String transactionType, double amount);
    public List<AccountTransaction> getLastFiveTransaction(int userID);
    
}
