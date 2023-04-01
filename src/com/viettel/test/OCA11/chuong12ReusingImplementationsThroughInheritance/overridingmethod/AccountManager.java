package com.viettel.test.OCA11.chuong12ReusingImplementationsThroughInheritance.overridingmethod;

public class AccountManager {
    public static void main(String[] args) {
        Account a = new Account(100, 0.2);
        //InterestCalculator ic = new InterestCalculator();
        InterestCalculator ic = new CompoundInterestCalculator();
        double interest = a.getInterest(ic, 2);
        System.out.println(interest);
    }
}
