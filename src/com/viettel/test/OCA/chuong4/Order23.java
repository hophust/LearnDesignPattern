package com.viettel.test.OCA.chuong4;

public class Order23 {
    String value = "t";

    {
        value += "a";
    }

    {
        value += "c";
    }

    public Order23() {
        value += "b";
    }

    public Order23(String s) {
        value += s;
    }

    public static void main(String[] args) {
        Order23 order = new Order23("f");
        System.out.println(order.value);// tacf
        order = new Order23();
        System.out.println(order.value);// tacb
    }
}
