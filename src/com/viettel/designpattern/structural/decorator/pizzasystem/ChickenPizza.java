package com.viettel.designpattern.structural.decorator.pizzasystem;

public class ChickenPizza implements IPizza {

    @Override
    public String doPizza() {
        return "I am a Chicken Pizza";
    }
}
