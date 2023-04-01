package com.viettel.test.practice.uniquetest1;

class MyException extends Exception {
}

public class Cau5 {
    public static void main(String[] args) throws MyException {
        Cau5 cau5 = new Cau5();
        try {
            cau5.m1();
        } catch (MyException e) {
            cau5.m1();
        } finally {
            cau5.m2();
        }
    }

    public void m1() throws MyException {
        throw new MyException();
    }

    public void m2() throws RuntimeException {
        throw new NullPointerException();
    }
}
