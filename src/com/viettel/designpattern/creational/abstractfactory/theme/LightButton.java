package com.viettel.designpattern.creational.abstractfactory.theme;

public class LightButton implements Button {
    @Override
    public String createButton() {
        return "create light button";
    }
}
