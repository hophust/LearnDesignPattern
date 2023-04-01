package com.viettel.test.practice.dethat;
class A {
    public int x = 42;
    public static void test(){
        System.out.println("A");
    }
    protected A(){

    }
}
class B extends A{
    public int x = 17;
    public static void test(){
        System.out.println("B");
    }
    public B(){
        super();
    }
}
public class Cau8 {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.x);
        a.test();
    }
}
