package com.viettel.test.OPC11Part2.chuong7.createthread;

public class PrintData implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("PrintData: " + i);
        }
    }
    public static void main(String[] args) {
        (new Thread(new PrintData())).start();
    }
}
