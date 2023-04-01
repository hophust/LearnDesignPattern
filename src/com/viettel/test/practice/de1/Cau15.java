package com.viettel.test.practice.de1;

public class Cau15 {
    int value = 1;
    Cau15 link;

    public Cau15(int val) {
        this.value = val;
    }

    public static void main(String[] args) {
        final var a = new Cau15(5);
        var b = new Cau15(10);
        a.link = b;
        b.link = setIt(a, b);
        System.out.println(a.link.value + " " + b.link.value);
    }

    public static Cau15 setIt(final Cau15 x, final Cau15 y) {
        x.link = y.link;
        return x;
    }
}
