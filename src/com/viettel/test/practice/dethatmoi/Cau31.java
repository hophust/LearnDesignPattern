package com.viettel.test.practice.dethatmoi;
enum Season{
    WINTER('w'),SPRING('s'),SUMMER('h'),FALL('f');
    char c;
    private Season(char c){
        this.c = c;
    }
}
public class Cau31 {
    public static void main(String[] args) {
        Season[] sA = Season.values();
        System.out.println(Season.valueOf("SPRING"));
        System.out.println(sA[1]);
        System.out.println(Season.SPRING);
        System.out.println(Season.valueOf("SPRING").ordinal());

        //System.out.println(Season.valueOf("s"));
    }
}
