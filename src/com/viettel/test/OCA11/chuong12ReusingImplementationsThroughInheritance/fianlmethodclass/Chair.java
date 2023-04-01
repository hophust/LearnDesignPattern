package com.viettel.test.OCA11.chuong12ReusingImplementationsThroughInheritance.fianlmethodclass;

import com.viettel.test.OCA11.chuong12ReusingImplementationsThroughInheritance.abstractclass.Furniture;

public final class Chair extends Furniture {
    @Override
    public void assemble() {

    }
    public static final void test(){

    }
    public final int getNum(){
        return 3;
    }

    public static void testStaticSub() {
        System.out.println("testStaticSub");
    }

    public static void testStatic() {
        System.out.println("testStatic");
    }

    public static void main(String[] args) {
        Furniture furniture = new Chair();
        ((Chair) furniture).testStaticSub();
        Furniture furniture1 = new Furniture() {
            @Override
            public void assemble() {
                System.out.println("test");
            }
        };
        furniture1.testStatic();
        Chair chair = new Chair();
        chair.testStatic();
    }
}
