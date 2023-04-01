package com.viettel.designpattern.structural.adapter.translation;

public class TranslatorAdapter implements  VietnameseTarget {
    private JapaneseAdaptee japaneseAdaptee;
    public TranslatorAdapter(JapaneseAdaptee japaneseAdaptee) {
        this.japaneseAdaptee = japaneseAdaptee;
    }
    @Override
    public void send(String words) {
        System.out.println("Reading words ...." + words);
        String vietnameseWords = this.translate(words);
        System.out.println("Translated!");
        japaneseAdaptee.receive(vietnameseWords);

    }

    private String translate(String vietnamese){
        return "こんにちは";
    }
}
