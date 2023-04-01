package com.viettel.test.OCA.chuong4;

import java.util.function.Predicate;

public class PredicateExample1 {
    public static void main(String[] args) {
        Predicate<String> stringPredicate = s -> s.equals("hopnv");
        System.out.println(stringPredicate.test("hopnv"));
        System.out.println(stringPredicate.test("hopnv9"));

        Predicate<Integer> integerPredicate = s -> s>5;
        System.out.println(integerPredicate.test(6));
    }
}
