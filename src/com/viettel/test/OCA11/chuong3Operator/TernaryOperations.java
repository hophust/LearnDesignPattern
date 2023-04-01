package com.viettel.test.OCA11.chuong3Operator;

public class TernaryOperations {
    public static void main(String[] args) {
        //int stripes = 7;
        //System.out.print((stripes > 5) ? 21 : "Zebra");
        //int animal = (stripes < 9) ? 3 : "Horse"; // DOES NOT COMPILE
        int pig = (short)4;
        pig = pig++;
        long goat = (int)2;
        goat -= 1.0;
        System.out.print(pig + " - " + goat);

        int parkAttendance = 0;
        System.out.println(parkAttendance); // 0
        System.out.println(++parkAttendance); // 1
        System.out.println(parkAttendance); // 1
        System.out.println(parkAttendance--); // 1
        System.out.println(parkAttendance); // 0


    }
}
