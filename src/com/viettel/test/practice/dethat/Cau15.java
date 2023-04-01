package com.viettel.test.practice.dethat;

import java.util.List;
import java.util.stream.Stream;

public class Cau15 {
    public static void main(String[] args) {
        List<Integer> a = List.of(113,110);
        List<Integer> b = List.of(112,111);
        Stream.of(a,b).flatMap(c->c.stream()).sorted().forEach(i-> System.out.println(i +""));
    }
}
