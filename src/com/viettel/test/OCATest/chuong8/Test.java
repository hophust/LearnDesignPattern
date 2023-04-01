package com.viettel.test.OCATest.chuong8;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.print('A');
            throw new RuntimeException("Out of bounds!");
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.print('B');
            //throw t;
        } finally {
            System.out.print('C');
        }

    }
}
