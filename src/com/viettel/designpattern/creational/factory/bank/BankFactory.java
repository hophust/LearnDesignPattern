package com.viettel.designpattern.creational.factory.bank;

public class BankFactory {
    private BankFactory(){}
    public static final Bank getBank(BankType bankType){
        switch (bankType){
            case TPBANK:
                return new TPBank();
            case VIETCOMBANK:
                return new VietcomBank();
            default:
                throw  new IllegalArgumentException("Exception");
        }
    }
}
