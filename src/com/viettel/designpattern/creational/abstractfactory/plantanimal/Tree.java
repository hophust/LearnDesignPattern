package com.viettel.designpattern.creational.abstractfactory.plantanimal;

public class Tree implements Plant {
    @Override
    public String createPlant() {
        return "create Tree";
    }
}
