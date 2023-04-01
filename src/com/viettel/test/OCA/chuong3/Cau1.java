package com.viettel.test.OCA.chuong3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cau1 {
    public static void main(String[] args) {
        /*int total = 0;
        StringBuilder letters = new StringBuilder("abcdefg");
        System.out.println(letters.length());
        System.out.println(letters.substring(1, 2));
        total += letters.substring(1, 2).length();
        total += letters.substring(6, 6).length();
        total += letters.substring(6, 5).length();
        System.out.println(total);*/
        /*List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        Collections.sort(hex);
        System.out.println(hex.toString());
        int x = Collections.binarySearch(hex, "8");
        int y = Collections.binarySearch(hex, "3A");
        int z = Collections.binarySearch(hex, "4F");
        System.out.println(x + " " + y + " " + z);*/
        /*String a = "";
        a += 2;
        a += 'c';
        a += false;
        if (a == "2cfalse") System.out.println("==");
        if (a.equals("2cfalse")) System.out.println("equals");*/
        /*int numFish = 4;
         String fishType = "tuna";
        String anotherFish = fishType+5;
        System.out.println(anotherFish + " " + fishType);
        System.out.println(numFish + " " + 1);*/
        int[] random = { 6, -4, 12, 0, -10 };
        int x = 12;
        int y = Arrays.binarySearch(random, x);
        System.out.println(y);
    }
}
