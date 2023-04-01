package com.viettel.test;

public class Q23 {
    enum Numbers {ONE, TWO, THREE};
    public static void main(String[] args) {
        A variable = new C();
        for(Numbers number : Numbers.values()) {
            System.out.print(number + " ") ;
        }

    }
}

class A{
    public A() {
        System.out.println("A");
    }
}

class B extends A{
    public B() {
        System.out.println("B");
    }
}

class C extends B{
    public C() {
        System.out.println("C");
    }
}