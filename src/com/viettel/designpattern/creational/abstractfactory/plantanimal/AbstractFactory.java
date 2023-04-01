package com.viettel.designpattern.creational.abstractfactory.plantanimal;

public class AbstractFactory {
    public Animal createAnimal(AnimalType animalType){
        return AnimalFactory.getAnimal(animalType);
    }
    public Plant createPlant(PlantType plantType){
        return PlantFactory.getPlant(plantType);
    }
}
