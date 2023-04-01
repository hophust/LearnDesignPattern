package com.viettel.test.Dethi03012020;

class Singer {
    public static String sing(){
        return "la";
    }
}
public class Cau3 extends Singer {
    public static String sing(){
        return "fa";
    }

    public static void main(String[] args) {
        Cau3 cau3 = new Cau3();
        Singer singer = new Cau3();
        System.out.println(cau3.sing() +"" +singer.sing());
    }
}
