package com.roi;

public class StandardAccount implements IAccount{
    private int AccountNumber;
    private double CreditLimit;
    private double  CurrentBalance;

    public StandardAccount(int AccountNumber, double CreditLimit) {
        this.AccountNumber=AccountNumber;
        this.CreditLimit=CreditLimit;
    }

    @Override
    public void Deposit(double amount) {
        this.CurrentBalance=amount;
    }

    @Override
    public double Withdraw(double amount) {
        double Balance = this.CurrentBalance;
        this.CurrentBalance-=amount;
        if (this.CurrentBalance<this.CreditLimit) {
            this.CurrentBalance += Balance - this.CreditLimit;
            return amount - Balance - CreditLimit;
        }
                else
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
