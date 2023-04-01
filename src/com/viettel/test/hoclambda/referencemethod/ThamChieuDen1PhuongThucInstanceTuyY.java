package com.viettel.test.hoclambda.referencemethod;


import java.util.Arrays;

public class ThamChieuDen1PhuongThucInstanceTuyY {
    public static void main(String[] args) {
        String stringArray[] = {"Java","C++","PHP"};
        Arrays.sort(stringArray,String::compareToIgnoreCase);
        for (String str: stringArray) {
            System.out.println(str);
        }
    }
}
