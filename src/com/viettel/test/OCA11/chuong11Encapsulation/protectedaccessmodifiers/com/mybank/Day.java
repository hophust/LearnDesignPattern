package com.viettel.test.OCA11.chuong11Encapsulation.protectedaccessmodifiers.com.mybank;

public enum Day {
    WEEKDAY, HOLIDAY;
    private Day(){

    }
    private int value;
    public int valuePublic;
    protected int valueProtected;
    int valueDefault;
    public void countPublic(){

    }
    private void countPrivate(){}
}
