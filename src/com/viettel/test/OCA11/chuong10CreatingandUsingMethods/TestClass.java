package com.viettel.test.OCA11.chuong10CreatingandUsingMethods;

public class TestClass {

    {
        //System.out.println(k);
        k =5;
        printI(); //valid forward reference
    }
    void printI() {
        System.out.print(i);
    }
    int i = 10;
    int k = 10;
    static int staticVar = 5;
    public static void main(String[] args) {
        staticVar =6;
        new TestClass();
    }

    public void test() {
        staticVar = 6;
    }

}
