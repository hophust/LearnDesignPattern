package com.viettel.designpattern.creational.abstractfactory.plantanimal;

public class PlantFactory {
    public static Plant getPlant(PlantType plantType){
        switch (plantType) {
            case Tree:
                return new Tree();
            case Grass:
                return new Grass();
            case Flower:
                return new Flower();
            default:
                break;
        }
        return null;

    }
}
