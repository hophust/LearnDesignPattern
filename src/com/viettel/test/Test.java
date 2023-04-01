package com.viettel.test;

class D {
    int i = 10;

    public void printValue() {
        System.out.println("Value-A");
    }

    ;
}

class E extends D {
    int i = 12;

    public void printValue() {
        System.out.print("Value-B");
    }
}

public class Test {
    public static void main(String argv[]) {
        /*D a = new E();
        a.printValue();
        System.out.println(a.i);*/

        try{
            String arr[] = new String[10];
            arr = null;
            arr[0] = "one";
            System.out.println(arr[0]);
        }
        catch(Exception e){System.out.println("Task chung duoc hoan thanh");}
        //catch(NullPointerException e){System.out.println("Task chung duoc hoan thanh");}

    }
}

