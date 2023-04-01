package com.viettel.designpattern.structural.adapter.translation;

public class Client {
    public static void main(String[] args) {
        VietnameseTarget vietnameseTarget = new TranslatorAdapter(new JapaneseAdaptee());
        vietnameseTarget.send("Hello world");
    }
}
