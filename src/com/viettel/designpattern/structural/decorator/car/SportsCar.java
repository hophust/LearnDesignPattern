package com.viettel.designpattern.structural.decorator.car;

public class SportsCar extends CarAssemble {
    public SportsCar(Car c) {
        super(c);
    }
    @Override
    public void assemble(){
        super.assemble();
        System.out.print(" Adding features of Sports Car.");
    }
}

