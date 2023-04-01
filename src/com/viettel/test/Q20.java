package com.viettel.test;
class Second extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
public class Q20 {
    public static void main(String[] args) {
        try {
            Thread.currentThread().setName("Main");
            Thread second = new Second();
            second.setName("Second");
            second.start();
            Thread.currentThread().join();
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
