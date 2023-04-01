package com.viettel.test.practice.de3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Cau49 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(10,47,33,23);
        int max = ls.stream().max(Comparator.comparing(a->a)).get();
        System.out.println(max);
        System.out.println(ls.stream().reduce((a,b)->a>b?a:b));
    }
}
