package com.viettel.test.dethinam2022.thang7;

public class Cau25 {
    static int someMethod(){return 100;}
    static class MyWorker{
        Runnable r;
        public MyWorker (Runnable r){
            this.r =r;
        }
    }

    public static void main(String[] args) {
        //Runnable r = (a)-> System.out.println(a);
        //Runnable r = (a)-> System.out::println();
       // Runnable r = ()-> System.out.println("Hello");
    }
}
