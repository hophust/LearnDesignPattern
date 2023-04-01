package com.viettel.designpattern.structural.bridge;

public class SavingAccount implements Account {
    @Override
    public void openAccount() {
        System.out.println("Saving account");
    }
}
