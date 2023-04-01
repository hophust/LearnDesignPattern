package com.viettel.designpattern.creational.abstractfactory.plantanimal;

public class Client {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new AbstractFactory();
        System.out.println( abstractFactory.createAnimal(AnimalType.Rabbit).createAnimal());
    }
}
