package com.roi;

import java.util.ArrayList;
import java.util.List;

public interface IBank {
    ArrayList<Bank.IAccount> accountList = null;
    double Balance = 0;

    void OpenAccount(Bank.IAccount account);

    void OpenAccount(IAccount account);

    void CloseAccount(int accountNumber);

    List<Bank.IAccount> GetAllAccounts();

    List<Bank.IAccount> GetAllAccountsInDebt();

    List<Bank.IAccount> GetAllAccountsWithBalance(double balanceAbove);
}
