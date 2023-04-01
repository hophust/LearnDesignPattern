package com.viettel.test.OPC11Part2.chuong7.threadsafe;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(3,6,8));
        //List<Integer> list = new CopyOnWriteArrayList<>(List.of(4,3,6));
        for (var n : list) {
            list.add(3);
        }
        System.out.println("Size = " + list.size());
    }
}
