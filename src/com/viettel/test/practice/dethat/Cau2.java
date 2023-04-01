package com.viettel.test.practice.dethat;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Cau2<N extends Number,C extends Collection<N>> {
    public Double sum(C collection){
        double sum = 0.0;
        for (N n : collection) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        var numbers = List.of(5,4,6,3,7,2,8,1);
        Cau2<Integer,List<Integer>> c = new Cau2<>();
        System.out.println(c.sum(numbers));
    }
}
