package com.viettel.test.OCA11.chuong5CoreJavaAPIs;

public class StringIsImmutable {
    public static void main(String[] args) {
        /*String s1 = "s1";
        String s2 = s1.concat(" s2 concat s1");
        s2.concat(" s2 concat without assign");
        System.out.println(s2);*/

        String string = "animals97";
        System.out.println(string.indexOf(97)); // 0
        System.out.println(string.indexOf(105)); // 0
        System.out.println(string.indexOf('a')); // 0
        System.out.println(string.indexOf("al")); // 4\
        System.out.println(string.indexOf('a', 4)); // 4
        System.out.println(string.indexOf("al", 5)); // -1

        System.out.println(string.substring(3));
        System.out.println(string.substring(3,5));

        System.out.println(string.substring(3, 3)); // empty string
        //System.out.println(string.substring(3, 2)); // throws exception
        //System.out.println(string.substring(3, 8)); // throws exception

        String upperLower = "aniMalS";
        System.out.println(upperLower.toUpperCase());
        System.out.println(upperLower.toLowerCase());
        System.out.println(upperLower.contains("a"));

        char ch = '\u2000';
        System.out.println("unicode");

        StringBuilder builder = new StringBuilder(10);
    }
}
