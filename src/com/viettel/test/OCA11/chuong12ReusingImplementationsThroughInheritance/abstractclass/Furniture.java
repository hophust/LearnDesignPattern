package com.viettel.test.OCA11.chuong12ReusingImplementationsThroughInheritance.abstractclass;

public abstract class Furniture {
    private String material;

    //public getter and setter
    public abstract void assemble(); //ends with a semicolon, no openingand closing curly braces

    public static void testStatic() {
        System.out.println("testStatic");
    }
}
