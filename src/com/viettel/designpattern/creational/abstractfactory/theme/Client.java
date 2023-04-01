package com.viettel.designpattern.creational.abstractfactory.theme;

public class Client {
    public static void main(String[] args) {
        WidgetFactory lightThemeWidgetFactory = new LightThemeWidgetFactory();
        ScrollBar scrollBar = lightThemeWidgetFactory.createScrollBar();
        System.out.println(scrollBar.createScrollBar());
        Button button = lightThemeWidgetFactory.createButton();
        System.out.println(button.createButton());

    }
}
