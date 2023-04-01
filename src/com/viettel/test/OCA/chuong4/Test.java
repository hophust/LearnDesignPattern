package com.viettel.test.OCA.chuong4;

public class Test {
    public void print(byte x) {
        System.out.print("byte");
    }

    public void print(int x) {
        System.out.print("int");
    }

    public void print(float x) {
        System.out.print("float");
    }

    public void print(Object x) {
        System.out.print("Object");
    }

    private Test() {
    }

    public static void main(String[] args) {
        Test t = new Test();
        short s = 123;
        t.print(s);
        t.print(true);
        t.print(6.789);
        Integer i = new Integer("5");
        Test.work(i);
        System.out.println(i);
    }

    public static void work(Integer integer) {
        integer = new Integer("10");
    }
}
