package com.viettel.test.Dethi03012020;
class A {
    void m(){
        System.out.println("outner");
    }
}
public class NewClass {
    public static void main(String[] args) {
        new NewClass().go();
    }
    void go(){
        new A().m();
        class A{
            void m(){
                System.out.println("inner");
            }
        }

    }
    class A{
        void m(){
            System.out.println("middle");
        }
    }
}
