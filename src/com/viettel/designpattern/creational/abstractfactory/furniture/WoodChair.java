package com.viettel.designpattern.creational.abstractfactory.furniture;

public class WoodChair implements Chair {
    @Override
    public void create() {
        System.out.println("Create wood chair");
    }
}
