package com.viettel.designpattern.creational.abstractfactory.theme;

public class DarkThemeWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new DarkScrollBar();
    }
}
