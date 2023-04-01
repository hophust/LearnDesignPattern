package com.viettel.test.practice.dethatmoi;

import java.util.function.BiPredicate;

public class Cau23 {
    public static void main(String[] args) {
        //BiPredicate<Integer,Integer> test = (final var x, y)->(x.equals(y));
        BiPredicate<Integer,Integer> test2 = (var x, final var y)->(x.equals(y));
        //BiPredicate<Integer,Integer> test3 = (Integer x, final var y)->(x.equals(y));
        BiPredicate<Integer,Integer> test4 = (Integer x, final Integer y)->(x.equals(y));
        //BiPredicate<Integer,Integer> test5 = (final Integer x, var y)->(x.equals(y));
    }
}
