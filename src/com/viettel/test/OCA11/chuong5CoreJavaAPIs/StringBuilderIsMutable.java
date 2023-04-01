package com.viettel.test.OCA11.chuong5CoreJavaAPIs;

public class StringBuilderIsMutable {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        sb.delete(0,1000);
        System.out.println(sub + " " + len + " " + ch);
        if(sb.equals(sub)){

        }
    }
}
