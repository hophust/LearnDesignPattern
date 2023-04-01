package com.viettel.designpattern.creational.abstractfactory.furniture;

public class WoodTable implements Table {
    @Override
    public void create() {
        System.out.println("Create wood table");
    }
}