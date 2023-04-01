package com.viettel.test.practice.dethat;

import java.util.function.Function;

public class Cau9 {
    public static void foo(Function<Integer,String> fun){

    }
    public static void main(String[] args) {
        //foo(n->Integer.toHexString(n));
        foo((Integer n) -> Integer.toHexString(n));
    }
}
