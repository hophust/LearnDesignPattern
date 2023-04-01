package com.viettel.test.OPC11Part2.chuong3;

import java.util.ArrayList;
import java.util.List;

public class TestWrapper {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(Integer.valueOf(3));
        numbers.add(Integer.valueOf(5));
        numbers.remove(1);
        numbers.remove(Integer.valueOf(5));
        System.out.println(numbers);
    }
}
