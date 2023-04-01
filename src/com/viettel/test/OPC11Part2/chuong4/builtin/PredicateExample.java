package com.viettel.test.OPC11Part2.chuong4.builtin;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();
        System.out.println(p1.test(""));
        System.out.println(p2.test(""));

        BiPredicate<String, String> p3= String::startsWith;
        BiPredicate<String, String> p4 = (x,y)->x.startsWith(y);
        System.out.println(p3.test("chicken","chick"));
        System.out.println(p4.test("chicken","chui"));
    }
}
