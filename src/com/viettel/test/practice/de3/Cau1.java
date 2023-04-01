package com.viettel.test.practice.de3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Cau1 {
    public static void main(String[] args) {
        List<String> vowels = new ArrayList<String>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
        Function<List<String>,List<String>> f = list->list.subList(2,4);
        List<String> tmp=f.apply(vowels);
        tmp.add("x");
        tmp.forEach(System.out::print);
        vowels.forEach(System.out::print);

    }
}
