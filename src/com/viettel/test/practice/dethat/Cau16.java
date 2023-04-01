package com.viettel.test.practice.dethat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Cau16 {
    public static void main(String[] args) {
        try(FileInputStream in = new FileInputStream("foo.txt")){

        } catch (Exception e) {

        } finally {
            //in.close();
        }
    }
}
