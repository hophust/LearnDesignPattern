package com.viettel.test.practice.dethat;

import java.util.ArrayList;
import java.util.List;

public class Cau26 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(List.of("Earth", "Wind", "Fire"));
        List<String> list2 = List.copyOf(list1);

        list1.sort((String item1, String item2) -> item1.compareTo(item2));
        list2.sort((String item1, String item2) -> item1.compareTo(item2));
        System.out.println(list2.equals(list1));
    }

}
