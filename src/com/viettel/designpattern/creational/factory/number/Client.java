package com.viettel.designpattern.creational.factory.number;

import java.text.NumberFormat;

public class Client {
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        NumberFormat numberFormat1 = NumberFormat.getPercentInstance();
        double x = 0.1;
        System.out.println(numberFormat.format(x));
        System.out.println(numberFormat1.format(x));
    }
}
