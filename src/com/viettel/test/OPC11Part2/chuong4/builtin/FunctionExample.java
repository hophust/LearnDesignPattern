package com.viettel.test.OPC11Part2.chuong4.builtin;

import java.util.concurrent.Future;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x->x.length();
        System.out.println(f1.apply("cluck"));
        System.out.println(f2.apply("cluck"));

        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 = (a,b)->a.concat(b);
        System.out.println(b1.apply("baby", "chick"));
        System.out.println(b2.apply("baby", "chick"));
    }
}
