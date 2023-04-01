package com.viettel.test.practice.dethatmoi;
class Super{
    static String greeting(){
        return "Good Night";
    }
    String name(){
        return "Harry";
    }
}

class Sub extends Super {
    static String greeting(){
        return "Good Morning";
    }
    String name(){
        return "Potter";
    }
}
public class Cau35 {
    public static void main(String[] args) {
        Super s = new Sub();
        System.out.println(s.greeting() + "-" + s.name());
    }
}
