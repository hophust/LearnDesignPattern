package com.viettel.test.OCA11.chuong12ReusingImplementationsThroughInheritance.overridingmethod;

public class DummyAccount extends Account {
    DummyAccount(double balance) {
        super(balance);
    }
    void printBalance(){
        System.out.println("No balance in dummy account");
    }
}
