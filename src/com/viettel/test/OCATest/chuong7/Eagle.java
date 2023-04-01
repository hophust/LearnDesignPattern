package com.viettel.test.OCATest.chuong7;

interface CanFly {
    public static void fly() {}
}
 class Bird {
    public int fly(int speed) {
        return 5;
    }
}
public class Eagle extends Bird implements CanFly {
    //public void fly() {}
}
