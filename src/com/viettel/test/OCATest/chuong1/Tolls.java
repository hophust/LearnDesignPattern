package com.viettel.test.OCATest.chuong1;

public class Tolls {
    private static int yesterday = 1;
    int tomorrow = 10;

    public static void main(String[] args) {
        Tolls tolls = new Tolls();
        int today = 20, tomorrow = 40;
        System.out.print(today + tolls.tomorrow + tolls.yesterday);
    }

    public static void testStatic(){
        //this.tomorrow;
        //tomorrow = 5; error
        yesterday = 5;
        System.out.println(Tolls.yesterday);
    }
}
