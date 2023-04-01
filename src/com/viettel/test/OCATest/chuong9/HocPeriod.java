package com.viettel.test.OCATest.chuong9;

import java.time.Period;

public class HocPeriod {
    public static void main(String[] args) {
        Period period0 = Period.of(0, 0, 0);
        System.out.println(period0);
        Period period1 = Period.of(2020, 0, 0);
        System.out.println(period1);

        Period period = Period.ofWeeks(1).ofDays(3);
        System.out.println(period);
        Period period2 = Period.ofDays(10);
        System.out.println(period2);
    }
}
