package com.hivetech.designPattern.bridg_pattern;

import com.hivetech.designPattern.bridg_pattern.account.CheckingAccount;
import com.hivetech.designPattern.bridg_pattern.bank.Bank;
import com.hivetech.designPattern.bridg_pattern.bank.bankimpl.TPBank;
import com.hivetech.designPattern.bridg_pattern.bank.bankimpl.VietCombank;

public class Main {
    public static void main(String[] args) {
        Bank vietcomBank = new VietCombank(new CheckingAccount());
        vietcomBank.openAccount();

        Bank tpBank = new TPBank(new CheckingAccount());
        tpBank.openAccount();
    }
}
