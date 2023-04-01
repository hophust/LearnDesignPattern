package com.viettel.test.OCA.chuong1;

public class Varargs {
    private int test;
    public static void main(String... $n) {
        Varargs varargs = new Varargs();
        varargs.testLocalValue();

    }

    public void testLocalValue(){
        int i1 = 1_234;
        double d4 = 1_234.0;
        //int amount = 0b101;
        //int amount = 0xE;
        double amount = 0xE;
        System.out.println(amount);

    }
}
