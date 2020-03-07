package com.hivetech.designPattern.bridg_pattern.bank.bankimpl;

import com.hivetech.designPattern.bridg_pattern.account.Account;
import com.hivetech.designPattern.bridg_pattern.bank.Bank;

public class TPBank extends Bank {
    public TPBank(Account account) {
        super(account);
    }
    @Override
    public void openAccount() {
        System.out.print("Open your account at TPBank is a ");
        account.openAccount();
    }
}
