package com.viettel.designpattern.structural.bridge;

public class CheckingAccount implements Account {
    @Override
    public void openAccount() {
        System.out.println("Checking account");
    }
}
