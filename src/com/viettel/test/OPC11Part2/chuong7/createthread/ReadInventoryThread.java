package com.viettel.test.OPC11Part2.chuong7.createthread;

public class ReadInventoryThread  extends Thread{
    public void run(){
        System.out.println("ReadInventoryThread");
    }
    public static void main(String[] args) {
        (new ReadInventoryThread()).start();
    }
}
