package com.viettel.test.practice.de2;

import java.util.Arrays;

public class Cau7 {
    public static void main(String[] args) {
        var a = new int[] {1,2,3};
        var b = new int[] {1,2,3,3};
        var c = new int[] {1,2,3,6};
        int x = Arrays.compare(a,b);
        int y = Arrays.compare(b,c);
        System.out.println(x+" " +y);
    }
}
