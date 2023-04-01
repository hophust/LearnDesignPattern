package com.viettel.test.OCATest.chuong7;
interface E{
    abstract void test();
}
interface C extends E{
    int test = 5;
    default void test(){

    }
}
interface D extends E{
    int test = 6;
    default void test(){

    }
}
public class A implements C,D{
    int test = 7;
    public static void main(String[] args) {

    }

    @Override
    public void test() {

    }
}
