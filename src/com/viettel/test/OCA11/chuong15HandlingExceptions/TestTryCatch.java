package com.viettel.test.OCA11.chuong15HandlingExceptions;

public class TestTryCatch {
    public void printLength(String str){
        System.out.println(str.length());
    }
    public static void main(String[] args) {
        try {
            int a = 5;

        } catch (Exception e) {
            int a =6;
            e.printStackTrace();
        }

        try {

        } finally {

        }

        try {

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

        try {

        } catch (Throwable e) {
            e.printStackTrace();
        }

        try {

        } catch (Error e) {
            e.printStackTrace();
        }
    }
}
