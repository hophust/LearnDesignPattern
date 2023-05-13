package com.viettel.designpattern.structural.decorator.pizzasystem;

public class TomatoPizza implements IPizza {

    @Override
    public String doPizza() {
        return "I am a Tomato Pizza";
    }
}