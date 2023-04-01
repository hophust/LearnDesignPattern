package com.viettel.designpattern.creational.abstractfactory.plantanimal;

public class AnimalFactory {
    public static Animal getAnimal(AnimalType animalType) {
        switch (animalType) {
            case Rat:
                return  new Rat();
            case Rabbit:
                return new Rabbit();
            default:
                break;
        }
        return null;
    }
}
