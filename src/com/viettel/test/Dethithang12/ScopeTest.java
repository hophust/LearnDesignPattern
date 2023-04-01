package com.viettel.test.Dethithang12;

public class ScopeTest {
    static int x = 5;
    int y = 8;

    public static void main(String[] args) {
        int x = (x = 3) * 4;
        int y = 10;
        String[] args1 = new String[5];
        System.out.println();
    }
}
