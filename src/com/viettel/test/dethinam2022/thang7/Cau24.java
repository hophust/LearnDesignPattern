package com.viettel.test.dethinam2022.thang7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Cau24 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("c:\temp.txt")) {
            System.out.println(fis);
        } /*finally {
            fis.close();
        }*/ catch (IOException | NullPointerException e) {

        }

    }
}
