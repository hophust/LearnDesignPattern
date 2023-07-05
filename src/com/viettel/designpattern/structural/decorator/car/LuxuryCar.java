package com.viettel.designpattern.structural.decorator.car;

public class LuxuryCar extends CarAssemble {
    public LuxuryCar(Car c) {
        super(c);
    }
    @Override
    public void assemble(){
        super.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }
}

