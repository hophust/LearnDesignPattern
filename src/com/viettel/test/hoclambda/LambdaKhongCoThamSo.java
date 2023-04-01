package com.viettel.test.hoclambda;

@FunctionalInterface
interface SayHello {
    public String sayHello();

}

public class LambdaKhongCoThamSo {
    public static void main(String[] args) {
        SayHello s = () -> {
            return "I have nothing to say";
        };
        System.out.println(s.sayHello());
    }
}
