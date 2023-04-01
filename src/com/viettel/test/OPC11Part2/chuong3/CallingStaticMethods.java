package com.viettel.test.OPC11Part2.chuong3;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class CallingStaticMethods {
    public static void main(String[] args) {
        Consumer<List<Integer>> methodRef = Collections::sort;
        Consumer<List<Integer>> lambda = x -> Collections.sort(x);
    }
}
