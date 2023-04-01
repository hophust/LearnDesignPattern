package com.viettel.test.OCA11.chuong13ProgrammingAbstractlyThroughInterfaces;

public interface Activity {
    public default void doIt(){
        System.out.println("Doing Activity");
    }
    int SIZE = 10;
    default void doIt2(){
        System.out.println("doIt2");
    }
}
