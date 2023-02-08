package com.cognixia.jump.model;

public class AccountTransaction {
    // Amount
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    };

    

    @Override
    public String toString() {
        return "SavingsAccount [balance=" + balance + "]";
    }

    // Withdraw Function
    public String withdraw(double Amount) {
        if (Amount > balance) {
            return "Can not withdraw more then current balance";
        } else {
            double newBalance = balance - Amount;
            setBalance(newBalance);
            return "You withdrew :" + Amount + "Your new balance is : " + getBalance();
        }
    }

    public String deposit(double Amount){
        double newBalance =  balance + Amount;
        setBalance(newBalance);
        return "You deposited: " + Amount +" New Balance is: " + newBalance;
    }

}
