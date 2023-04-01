package com.viettel.test.OCA11.chuong12ReusingImplementationsThroughInheritance.overridingmethod;

public class Account {
    double balance;
    double rate;

    Account(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
        this.printBalance();
    }

    Account(double balance) {
        this.balance = balance;
        this.printBalance();
    }

    double getInterest(InterestCalculator ic, double yrs) {
        try {
            Number n = ic.computeInterest(balance, yrs, rate);
            return n.doubleValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0.0;
    }
    void printBalance(){
        System.out.println(balance);
    }
}
