package com.viettel.designpattern.creational.abstractfactory.theme;

public class DarkButton implements Button {
    @Override
    public String createButton() {
        return "create dark button";
    }
}
