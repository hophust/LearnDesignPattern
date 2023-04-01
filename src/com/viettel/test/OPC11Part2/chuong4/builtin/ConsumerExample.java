package com.viettel.test.OPC11Part2.chuong4.builtin;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x->System.out.println(x);
        c1.accept("hopnv");
        c2.accept("hopnv");

        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k,v)->map.put(k,v);
        b1.accept("chicken",7);
        b2.accept("chick",1);
        System.out.println(map);
    }
}
