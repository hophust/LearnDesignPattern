package com.viettel.designpattern.structural.decorator.car;

public class CarAssemble implements Car {
    protected Car car;
    public CarAssemble(Car c){
        this.car=c;
    }
    @Override
    public void assemble() {
        this.car.assemble();
    }
}

