package com.viettel.test.practice.de2;

public class Cau42 {
    public static void main(String[] args) {
        var c = 0;
        JACK:
        while (c < 8) {
            JILL:
            if (c > 3) {
                System.out.println(c);
                break JILL;
            } else {
                System.out.println(c);
                c++;
            }
        }
    }
}
