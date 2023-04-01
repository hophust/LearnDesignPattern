package com.viettel.test.OCA11.chuong13ProgrammingAbstractlyThroughInterfaces;

public interface Readable {
    int SIZE = 10;
    void read();
    static void staticMethod(){
        System.out.println("In Readable.staticMethod");
    };
    default void defaultMethod(){
        System.out.println("In Readable.defaultMethod");
    };

}
