package com.hivetech.designPattern.bridg_pattern.bank.bankimpl;

import com.hivetech.designPattern.bridg_pattern.account.Account;
import com.hivetech.designPattern.bridg_pattern.bank.Bank;

public class VietCombank extends Bank {
    public VietCombank(Account account) {
        super(account);
    }

    @Override
    public void openAccount() {
        System.out.print("Open your account at VietcomBank is a ");
        account.openAccount();

    }
}
