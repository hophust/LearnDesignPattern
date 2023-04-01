package com.viettel.test.OPC11Part2.chuong4.dethi;

public class MyProcessor {
    int value;
    public MyProcessor(){ value = 10; }
    public MyProcessor(int value){
        this.value = value;
    }
    public void process(){
        System.out.println("Processing "+value);
    }
}
