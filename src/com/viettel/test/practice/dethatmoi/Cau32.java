package com.viettel.test.practice.dethatmoi;

import java.text.NumberFormat;
import java.util.Locale;

public class Cau32 {
    public static void main(String[] args) {
        Locale locale = Locale.US;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        //NumberFormat numberFormat = NumberFormat.getInstance(locale);
        //NumberFormat numberFormat = NumberFormat.getInstance(locale).getCurrency();
        double currency = 1_00.00;
        System.out.println(numberFormat.format(currency));
    }
}
