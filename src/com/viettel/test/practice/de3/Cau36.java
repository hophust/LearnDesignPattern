package com.viettel.test.practice.de3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Cau36 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "x");
        map.put("b", "x");
        /*BiFunction<String, String, String> f = (a, b) -> {
            return a.concat(b);
        };*/
        BiFunction<String, String, String> f = String::concat;
        map.merge("b","y",f);
        map.merge("c","y",f);
        System.out.println(map);
    }
}
