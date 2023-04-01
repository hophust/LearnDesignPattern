package com.viettel.test.OCA11.chuong4MakingDecisions;

public class StatementIf {
    public static void main(String[] args) {
        byte hourOfDay = 0;
        short morningGreetingCount = 1;
        if(hourOfDay < 11)
            System.out.println("Good Morning");
            morningGreetingCount++;
            System.out.println(morningGreetingCount);
    }
}
