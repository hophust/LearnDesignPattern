package com.viettel.test.OCATest.chuong9;

import java.time.LocalTime;

public class HocLocalTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(16, 40);
        String amPm = time.getHour() >= 12 ? (time.getHour() == 12) ? "AM" :"PM" : "PM";
        System.out.println(amPm);
    }
}
