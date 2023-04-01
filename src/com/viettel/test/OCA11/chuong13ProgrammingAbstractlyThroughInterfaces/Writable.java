package com.viettel.test.OCA11.chuong13ProgrammingAbstractlyThroughInterfaces;

public interface Writable {
    int SIZE = 20;

    void write();

    static void staticMethod() {
        System.out.println("In Writable.staticMethod");
    }

    //commenting the following two methods out
    /*default void defaultMethod() {
        System.out.println("In Writable.defaultMethod");
    }*/

    /* defaultMethod();*/


}
