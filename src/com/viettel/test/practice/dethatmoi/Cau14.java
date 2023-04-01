package com.viettel.test.practice.dethatmoi;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Cau14 {
    public static void main(String[] args) {
        try {
            doA();
            doB();
        } catch (IOException e) {
            System.out.println("c");
            return;
        } finally {
            System.out.println("d");
        }
        System.out.println("f");
    }
    public static void doA(){
        System.out.println("a");
        if(false){
            throw new IndexOutOfBoundsException();
        }
    }

    public static void doB() throws FileNotFoundException {
        System.out.println("b");
        if(true){
            throw new FileNotFoundException();
        }
    }
}
