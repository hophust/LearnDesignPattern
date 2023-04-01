package com.viettel.designpattern.creational.abstractfactory.furniture;

public class PlasticChair implements Chair {
    @Override
    public void create() {
        System.out.println("Create plastic chair");
    }
}