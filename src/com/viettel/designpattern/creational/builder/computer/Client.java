package com.viettel.designpattern.creational.builder.computer;

public class Client {
    public static void main(String[] args) {
        Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();
        System.out.println(comp);
    }
}
