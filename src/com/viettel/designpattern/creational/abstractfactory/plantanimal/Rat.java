package com.viettel.designpattern.creational.abstractfactory.plantanimal;

public class Rat implements Animal {
    @Override
    public String createAnimal() {
        return "create Rat";
    }
}
