package com.viettel.test.practice.dethatmoi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Foo{
    public void foo(Collection arg) {
        System.out.println("Bonjour le monde!");
    }
}
public class Cau28 extends Foo{
    public void foo(List arg){
        System.out.println("Hello word");
    }
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        Collection<String> co = li;
        Cau28 cau28 = new Cau28();
        cau28.foo(li);
        cau28.foo(co);
    }
}
