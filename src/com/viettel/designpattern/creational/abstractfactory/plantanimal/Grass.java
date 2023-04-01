package com.viettel.designpattern.creational.abstractfactory.plantanimal;

public class Grass implements Plant {
    @Override
    public String createPlant() {
        return "create Grass";
    }
}
