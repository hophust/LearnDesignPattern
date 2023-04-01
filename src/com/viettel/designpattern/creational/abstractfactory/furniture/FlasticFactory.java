package com.viettel.designpattern.creational.abstractfactory.furniture;

public class FlasticFactory extends FurnitureAbstractFactory {

    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }

}
