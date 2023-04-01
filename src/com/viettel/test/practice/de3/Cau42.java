package com.viettel.test.practice.de3;

import java.util.Arrays;
import java.util.List;

public class Cau42 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(3,4,6,9,2,5,7);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(ls.stream().reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b));
        System.out.println(ls.stream().max(Integer::max));
        System.out.println(ls.stream().max(Integer::compare));
        System.out.println(Integer.max(3,4));

    }
}
