package com.viettel.designpattern.creational.factory.bank;

public class Client {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.TPBANK);
        System.out.println(bank.getBankName());
    }
}
