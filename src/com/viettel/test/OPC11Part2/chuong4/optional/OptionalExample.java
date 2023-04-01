package com.viettel.test.OPC11Part2.chuong4.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<Double> doubleOptional = average(3,6,9);
        Optional<Double> doubleOptional1 = average();
        if(doubleOptional.isPresent()) {
            System.out.println("doubleOptional1 - " +doubleOptional.get());
        }
        System.out.println("doubleOptional2 - " + doubleOptional.orElse(Double.NaN));
        System.out.println(doubleOptional1.orElse(Double.NaN));
        System.out.println(doubleOptional1.orElseGet(()->Math.random()));
        //System.out.println(doubleOptional1.orElseThrow());
        System.out.println(doubleOptional1.orElseThrow(()->new IllegalStateException()));
    }

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return Optional.of((double) sum/scores.length);
    }
}
