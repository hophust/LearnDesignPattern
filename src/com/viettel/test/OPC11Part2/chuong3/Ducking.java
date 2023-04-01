package com.viettel.test.OPC11Part2.chuong3;

public class Ducking {
    public static void makeSound(String sound) {
        //LearnToSpeak learnToSpeak = s -> System.out.println(s);
        LearnToSpeak learnToSpeak = System.out::println;
        DuckHelper.teacher(sound,learnToSpeak);
    }

    public static void main(String[] args) {
        makeSound("hopnv");
    }
}
