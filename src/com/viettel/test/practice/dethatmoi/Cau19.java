package com.viettel.test.practice.dethatmoi;

public class Cau19 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder(5);
        stringBuilder.append("HOWDY");
        stringBuilder.insert(0,' ');
        stringBuilder.replace(3,5,"LL");
        stringBuilder.insert(6,"COW");
        stringBuilder.delete(2,7);
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.length());
    }
}
