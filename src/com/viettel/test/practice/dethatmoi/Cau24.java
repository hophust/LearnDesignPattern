package com.viettel.test.practice.dethatmoi;

import java.io.FileReader;
import java.io.IOException;

public class Cau24 {
    public static void main(String[] args) {
        char[] characters = new char[100];
        try(FileReader reader= new FileReader("test.txt")){
            reader.read(characters);
        } catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
