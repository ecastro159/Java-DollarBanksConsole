package com.cognixia.jump.DAO;

import java.util.List;

import com.cognixia.jump.model.Account;

public interface TransactionHistoryDAO {
    public void deposit(int accountType, int account_id);

    public void withdraw(int accountType, int account_id);

    public void transfer(int accountType, int account_id);
}
