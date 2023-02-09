package com.cognixia.jump.DAO;

import java.util.List;

import com.cognixia.jump.model.Account;

public interface AccountDAO {

    public double currentBalanceInChecking(int account_id);

    public double currentBalanceInSavings(int account_id);

    public void depositNewAccount(int account_id, double amount);

    public void depositToSavings(int account_id, double amount);

    public void depositToChecking(int account_id, double amount);

    public void withdrawFromSavings(int account_id, double amount);

    public void withdrawFromChecking(int account_id, double amount);

    public void transfer(int account_id, double amount);
}
