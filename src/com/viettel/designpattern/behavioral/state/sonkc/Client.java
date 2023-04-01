package com.viettel.designpattern.behavioral.state.sonkc;

public class Client {
    public static void main(String[] args) {
        System.out.println("--- State Pattern ---");
        Delivery delivery = new Delivery();
        delivery.goNext().goNext();
    }
}
