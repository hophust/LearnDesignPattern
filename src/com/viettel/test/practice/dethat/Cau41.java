package com.viettel.test.practice.dethat;

public class Cau41 {
    public static final int z = 5;
    public static int reduce(int x){
         int y=4;
        class Computer {
            int reduce(int x){
                return x-z;
            }
        }
        Computer computer = new Computer();
        return computer.reduce(x);
    }

    public static void main(String[] args) {
        System.out.println(reduce((1)));
    }
}
