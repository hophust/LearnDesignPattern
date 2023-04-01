package com.viettel.test.practice.dethatmoi;
interface ExampleInterface{
    static String origin = "Interface";
    void exampleMethod(String first);
}
abstract class ExampleAbstractClass{
    static String origin ="Abstract Class";
    abstract void exampleMethod(String first, String second);
}
public class Cau7 extends ExampleAbstractClass implements ExampleInterface{
    static String origin ="Cau7";
    @Override
    public void exampleMethod(String first) {
        System.out.println("Cau 7");
    }

    @Override
    void exampleMethod(String first, String second) {

    }

    public static void main(String[] args) {
        ExampleInterface theInstance = new Cau7();
        theInstance.exampleMethod(origin);
    }
}
