package com.hivetech.designPattern.bridg_pattern.account;

import com.hivetech.designPattern.bridg_pattern.account.Account;

public class CheckingAccount implements Account {
    @Override
    public void openAccount() {
        System.out.println("Checking  Account");
    }
}
