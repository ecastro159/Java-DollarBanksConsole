package com.cognixia.jump.model;

public class Account {
    private int account_id;
    private int customer_id;
    private double savings_Balance;
    private double checking_Balance;

    public int getAccount_id() {
        return account_id;
    }
    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }
    public int getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
    public double getSavings_Balance() {
        return savings_Balance;
    }
    public void setSavings_Balance(double savings_Balance) {
        this.savings_Balance = savings_Balance;
    }
    public double getChecking_Balance() {
        return checking_Balance;
    }
    public void setChecking_Balance(double checking_Balance) {
        this.checking_Balance = checking_Balance;
    }
    @Override
    public String toString() {
        return "Account [account_id=" + account_id + ", customer_id=" + customer_id + ", savings_Balance="
                + savings_Balance + ", checking_Balance=" + checking_Balance + "]";
    }

    public Account(int customer_id, double checking_Balance) {
        this.customer_id = customer_id;
        this.checking_Balance = checking_Balance;
    }

    // public String Transfer(String transfer_From, String trans)

    
    
    
    
}
