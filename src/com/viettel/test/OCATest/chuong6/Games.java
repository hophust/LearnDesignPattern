package com.viettel.test.OCATest.chuong6;

public final class Games {
    public final static int finish(int score) {
        final int win = 3;
        int result = score++ < 5 ? 2 : win;
        return result+=win;
    }
    public static void main(final String[] v) {
        System.out.print(finish(Integer.parseInt(v[0])));
    }
}
