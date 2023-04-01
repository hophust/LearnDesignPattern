package com.viettel.test.OPC11Part2.chuong7.createthread;

import com.viettel.test.OPC11Part2.chuong7.createthread.PrintData;
import com.viettel.test.OPC11Part2.chuong7.createthread.ReadInventoryThread;

public class StartThread {
    public static void main(String[] args) {
        System.out.println("begin");
        /*(new ReadInventoryThread()).start();
        (new Thread(new PrintData())).start();
        (new ReadInventoryThread()).start();*/
        (new ReadInventoryThread()).run();
        (new Thread(new PrintData())).run();
        (new ReadInventoryThread()).run();
        System.out.println("end");
    }
}
