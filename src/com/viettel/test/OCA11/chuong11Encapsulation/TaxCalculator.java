package com.viettel.test.OCA11.chuong11Encapsulation;

public class TaxCalculator {
    double rate = 0.1;
    double getTaxAnout(double price) {
        return rate * price;
    }

    double getTaxAmoutNotHardCoded(double price) {
        return getRateFromDB() * price;
    }
    double getRateFromDB(){
        return 5.6;
    }
    private int testPrivate = 0;

    public static void main(String[] args) {

    }

}
