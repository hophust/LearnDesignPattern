package com.viettel.test.OCA11.chuong13ProgrammingAbstractlyThroughInterfaces;

public interface Task {
    public default void doIt(){
        System.out.println("Doing Task");
    }
    long SIZE = 20;
    void doIt2();
}
