package com.viettel.designpattern.structural.decorator.car;

public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }
}

