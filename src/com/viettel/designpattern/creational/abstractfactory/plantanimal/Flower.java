package com.viettel.designpattern.creational.abstractfactory.plantanimal;

public class Flower implements Plant {
    @Override
    public String createPlant() {
        return "create Flower";
    }
}
