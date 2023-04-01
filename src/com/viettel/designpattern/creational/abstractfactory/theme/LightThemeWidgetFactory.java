package com.viettel.designpattern.creational.abstractfactory.theme;

public class LightThemeWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public ScrollBar createScrollBar() {
       return new LightScrollBar();
    }
}
