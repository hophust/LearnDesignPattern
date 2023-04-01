package com.viettel.test.practice.uniquetest1;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Cau3 {
    public static void main(String[] args) {
        List<String> letters = Arrays.asList("j","a","v","a");

        //letters.forEach(letter->letter.toUpperCase());
        System.out.println(letters.stream().collect(Collectors.joining()).toUpperCase());
    }
}
