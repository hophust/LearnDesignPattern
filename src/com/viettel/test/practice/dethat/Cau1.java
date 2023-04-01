package com.viettel.test.practice.dethat;

import java.util.function.LongFunction;

public class Cau1 {
    public static void main(String[] args) {
        LongFunction<Long> function = x-> x*x;
        long test = function.apply(100);
        System.out.println(test);
    }
}
