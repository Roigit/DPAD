package com.roi;

import com.sun.source.tree.IfTree;

public class BasicAccount implements IAccount{
    private int AccountNumber;
    private double WithdrawalLimit;
    private double CurrentBalance;

    public BasicAccount(int AccountNumber, double WithdrawalLimit) {
        this.AccountNumber=AccountNumber;
        this.WithdrawalLimit=WithdrawalLimit;
    }

    @Override
    public void Deposit(double amount) {
        this.CurrentBalance=amount;
    }

    @Override
    public double Withdraw(double amount) {
           if(this.CurrentBalance>amount) {
               if ((amount) > (this.WithdrawalLimit)) {
                   this.CurrentBalance -= this.WithdrawalLimit;
                   return this.WithdrawalLimit;
               }
               this.CurrentBalance -= amount;
               return amount;
           }
            double X = this.CurrentBalance;
                    this.CurrentBalance=0;
                            return X;
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
