package com.viettel.test.OCATest.chuong6;

public class Phone {
    private int size;
    public static  int testStatic;
    public final static  int testFinalStatic;
    static {
        testFinalStatic = 6;
    }
    public Phone(int size) {this.size=size;}
    public static void sendHome(Phone p, int newSize) {
        testStatic = 5;
        p = new Phone(newSize);
        p.size = 4;
    }
    public static final void main(String... params) {
        final Phone phone = new Phone(3);
        //phone = new Phone(5);
        sendHome(phone,7);
        System.out.print(phone.size);
    }
}
