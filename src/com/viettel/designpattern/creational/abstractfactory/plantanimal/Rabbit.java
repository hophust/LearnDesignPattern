package com.viettel.designpattern.creational.abstractfactory.plantanimal;

public class Rabbit implements Animal {
    @Override
    public String createAnimal() {
        return "create rabbit";
    }
}
