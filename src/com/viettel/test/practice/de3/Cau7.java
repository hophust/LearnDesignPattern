package com.viettel.test.practice.de3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Cau7 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("j","a","v","a");
        String word = stringList.stream().collect(Collectors.groupingBy(a->a)).toString();
        System.out.println(word);
        System.out.println(stringList.stream().collect(Collectors.groupingBy(a->"")).toString());
    }
}
