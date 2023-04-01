package com.viettel.designpattern.creational.abstractfactory.furniture;

public class PlasticTable implements Table {
    @Override
    public void create() {
        System.out.println("Create plastic table");
    }
}
