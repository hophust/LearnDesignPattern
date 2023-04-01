package com.viettel.test.practice.dethat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cau40 {
    public static void main(String[] args) {
        try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Input: ");
            String input = in.readLine();
            System.out.println("Echo:" +input);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
