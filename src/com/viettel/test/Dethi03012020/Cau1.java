package com.viettel.test.Dethi03012020;

public class Cau1 {
    public static void main(String[] args) {
        int j = 7;
        assert (++j > 7);
        assert (++j > 8) : "hi";
        assert (j > 10) : j = 12;
        assert (j == 12) : doStuff();
        assert (j == 12) : new Cau2();
    }
    static int doStuff() {
        return 1;
    }
}
