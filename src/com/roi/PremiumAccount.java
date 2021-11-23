package com.roi;

public class PremiumAccount implements IAccount{
    private int AccountNumber;
    private double CurrentBalance;

    public PremiumAccount(int AccountNumber){
        this.AccountNumber = AccountNumber;
    }

    @Override
    public void Deposit(double amount) {
        this.CurrentBalance=amount;
    }

    @Override
    public double Withdraw(double amount) {
        this.CurrentBalance-=amount;
        return amount;
    }

    @Override
    public double GetCurrentBalance() {
        return CurrentBalance;
    }

    @Override
    public int GetAccountNumber() {
        return AccountNumber;
    }


    }