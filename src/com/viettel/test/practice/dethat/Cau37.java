package com.viettel.test.practice.dethat;

import java.util.List;

public class Cau37 {
    public static void main(String[] args) {
        List<Integer> list = List.of(11,12,13,12,13);
        Double e = Double.valueOf(list.get(0));
        System.out.println(e);
        //Double d = (Double) list.get(0);
    }
}
