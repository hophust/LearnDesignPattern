package com.viettel.designpattern.creational.abstractfactory.theme;

public class DarkScrollBar implements ScrollBar {
    @Override
    public String createScrollBar() {
        return "create dark scroll bar";
    }
}
