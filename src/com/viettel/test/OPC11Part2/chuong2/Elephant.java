package com.viettel.test.OPC11Part2.chuong2;

public abstract class Elephant {
    @Injured("Legs") public void fallDown(){}
    @Injured(value="Legs") public abstract int trip();
}
