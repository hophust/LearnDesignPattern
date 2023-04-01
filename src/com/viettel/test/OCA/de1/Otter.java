package com.viettel.test.OCA.de1;

interface Mammal {
    public default String getName(){return null;}
}
abstract class Otter implements Mammal,Animal{
    @Override
    public String getName() {
        return "hopnv test";
    }
    /*@Override
    public abstract String getName();*/
}

abstract class Test{

    abstract String testAb();
}
