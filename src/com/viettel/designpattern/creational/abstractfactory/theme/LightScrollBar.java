package com.viettel.designpattern.creational.abstractfactory.theme;

public class LightScrollBar implements ScrollBar {
    @Override
    public String createScrollBar() {
        return "create light scrollbar";
    }
}
