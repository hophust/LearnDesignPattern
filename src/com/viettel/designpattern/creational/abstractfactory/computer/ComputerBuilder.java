package com.viettel.designpattern.creational.abstractfactory.computer;

public class ComputerBuilder {
    public static Computer getComputer(ComputerInterface ci){
        return ci.createComputer();
    }
}

