package com.viettel.test.hoclambda.referencemethod;

@FunctionalInterface
interface SayHello1{
    void display(String say);
}

class Hello implements SayHello1{
    public Hello(String say){
        System.out.println(say);
    }

    @Override
    public void display(String say) {
        System.out.println(say);
    }
}

public class ThamChieuDen1Constructor {
    public static void main(String[] args) {
        SayHello1 ref = Hello::new;
        ref.display("Welcome to gpcoder.com");
    }
}
