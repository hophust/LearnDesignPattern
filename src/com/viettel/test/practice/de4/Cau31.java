package com.viettel.test.practice.de4;

import java.util.Arrays;
import java.util.List;

public class Cau31 {
    public static void main(String[] args) {
        List<String> al = Arrays.asList("aa", "aaa", "b", "cc", "ccc", "ddd", "a");
        al.stream().filter(str->str.compareTo("c")<0).forEach(System.out::println);
    }
}
