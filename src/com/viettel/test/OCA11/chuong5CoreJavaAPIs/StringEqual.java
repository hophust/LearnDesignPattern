package com.viettel.test.OCA11.chuong5CoreJavaAPIs;

public class StringEqual {
    public static void main(String[] args) {
        String x = "Hello World";
        String z = " Hello World".trim();
        System.out.println(x.equals(z)); // true

        StringEqual t1 = new StringEqual();
        StringEqual t2 = new StringEqual();
        StringEqual t3 = t1;
        System.out.println(t1 == t3); // true
        System.out.println(t1 == t2); // false
        System.out.println(t1.equals(t2)); // false

        StringBuilder a = new StringBuilder("a");
        StringBuilder b = new StringBuilder("a");
        if(a.equals(b)){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
        if(a.toString().equals(b.toString())){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        String name2 = new String("Hello World").intern();
        String name = "Hello World";

        System.out.println(name == name2); // true

        System.out.println("--------------------tricky");

        String first = "rat" + 1;
        String second = "r" + "a" + "t" + "1";
        String third = "r" + "a" + "t" + new String("1");
        System.out.println(first == second);
        System.out.println(first == second.intern());
        System.out.println(first == third);
        System.out.println(first == third.intern());

        System.out.println("--------------------tricky1");


        String singleString = "hello world";
        String oneLine = "hello " + "world";
        String concat = "hello ";
        concat = concat+ "world";
        System.out.println(singleString +"-"+oneLine+"-"+concat);
        System.out.println(singleString == oneLine);
        System.out.println(singleString == concat);
        System.out.println(singleString.equals(oneLine));
        System.out.println(singleString.equals(concat));

    }
}
