package com.viettel.test.practice.dethatmoi;

import java.util.Comparator;

public class Cau22 implements Comparator{
    public static void main(String[] args) {
        new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
