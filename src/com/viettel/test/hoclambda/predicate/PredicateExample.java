package com.viettel.test.hoclambda.predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> stringPredicate = s -> s.equals("hopnv9");
        System.out.println(stringPredicate.test("hopnv9"));
        System.out.println(stringPredicate.test("hopnv8"));

        Predicate<Integer> integerPredicate = i -> i >0;
        System.out.println(integerPredicate.test(1));
        System.out.println(integerPredicate.test(-1));

        Predicate<String> predicateAnd = stringPredicate.and(s -> s.length() == 6);
        System.out.println(predicateAnd.test("hopnv9"));

        Predicate<String> predicateOr = stringPredicate.or(s -> s.length() == 7);
        System.out.println(predicateOr.test("hopnv91"));

        Predicate<String> predicateNegate = stringPredicate.negate();
        System.out.println(predicateNegate.test("hopnv9"));
    }
}




