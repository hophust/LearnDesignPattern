package com.viettel.designpattern.structural.bridge;

public class Client {
    public static void main(String[] args) {
        Bank vietcomBank = new VietcomBank(new CheckingAccount());
        vietcomBank.openAccount();

        Bank tpBank = new TPBank(new SavingAccount());
        tpBank.openAccount();

        Bank tpBank1 = new TPBank(new CheckingAccount());
        tpBank1.openAccount();
    }
}
