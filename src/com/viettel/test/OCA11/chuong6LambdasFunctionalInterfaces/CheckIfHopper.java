package com.viettel.test.OCA11.chuong6LambdasFunctionalInterfaces;

public class CheckIfHopper implements CheckTrait {
    @Override
    public boolean test(Animal animal) {
        return animal.canHop();
    }
}
