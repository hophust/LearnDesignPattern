package com.viettel.test.OCA.chuong4;

interface Climb {
    boolean isTooHigh(int height, int limit);
}

public class Climber {
    public static void main(String[] args) {
        //check((h, l) -> h.append(l).isEmpty(), 5);
    }

    private static void check(Climb climb, int height) {
        if (climb.isTooHigh(height, 10))
            System.out.println("too high");
        else
            System.out.println("ok");
    }
}
