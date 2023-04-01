package com.viettel.test.OCATest.chuong6;

public class Ski {
    private int age = 18;
    private static void slalom(Ski racer, int[] speed, String name) {
        racer.age = 18; // có thể thay đổi giá trị của thuộc tính của đối tượng final nhưng không thể khởi tạo lại đối tượng đó
        name = "Wendy";
        speed = new int[1];
        speed[0] = 11;
        racer = null;
    }
    public static void main(String... mountain) {
        Ski mySkier = new Ski();
        mySkier.age = 16;
        int[] mySpeed = new int[1];
        String myName = "Rosie";
        slalom(mySkier,mySpeed,myName);
        System.out.println(mySkier.age);
        System.out.println(myName);
        System.out.println(mySpeed[0]);
    }

}
