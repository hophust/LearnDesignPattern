package com.viettel.test.OPC11Part2.chuong4.builtin;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();
        System.out.println(s1.get());
        System.out.println(s2.get());

        Supplier<StringBuilder> s3 = StringBuilder::new;
        Supplier<StringBuilder> s4 = () -> new StringBuilder();
        System.out.println(s3.get());
        System.out.println(s4.get());

        Supplier<ArrayList<String>> s5 = ArrayList<String>::new;
        Supplier<ArrayList<String>> s6 = ()->new ArrayList<String>();
        System.out.println(s5.get());
        System.out.println(s6.get());
    }
}
