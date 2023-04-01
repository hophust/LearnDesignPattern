package com.viettel.test.OPC11Part2.chuong2;

public class Zoo {
    public static class Monkey{
    }
    @Risk(danger ="a")
    @Risk(danger = "b",level = 5)
    @Risk(danger = "c",level = 10)
    private Monkey monkey;
}
