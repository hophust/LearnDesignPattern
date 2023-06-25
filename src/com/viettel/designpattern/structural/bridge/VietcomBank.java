package com.viettel.designpattern.structural.bridge;


public class VietcomBank extends Bank {
    public VietcomBank(Account account) {
        super(account);
    }
    @Override
    public void openAccount() {
        System.out.println("Open your account at VietcomBank is: ");
        account.openAccount();
    }
}
