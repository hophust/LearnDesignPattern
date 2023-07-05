package com.viettel.designpattern.creational.abstractfactory.computer;

public class Client {
    public static void main(String[] args) {
        testBuildComputer();
    }
    private static void testBuildComputer() {
        Computer pc = ComputerBuilder.getComputer(new PCImpl("2 GB","500 GB","2.4 GHz"));
        Computer server = ComputerBuilder.getComputer(new ServerImpl("16 GB","1 TB","2.9 GHz"));
        System.out.println("PC Config::"+pc);
        System.out.println("Server Config::"+server);
    }

}
