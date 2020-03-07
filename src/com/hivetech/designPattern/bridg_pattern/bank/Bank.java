package com.hivetech.designPattern.bridg_pattern.bank;

import com.hivetech.designPattern.bridg_pattern.account.Account;

public abstract class Bank {
    protected Account account;
    public Bank(Account account) {
        this.account = account;
    }

    public abstract void openAccount();
}
