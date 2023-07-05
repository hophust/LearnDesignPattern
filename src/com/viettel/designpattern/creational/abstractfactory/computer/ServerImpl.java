package com.viettel.designpattern.creational.abstractfactory.computer;

public class ServerImpl implements ComputerInterface {
    private String ram;
    private String hdd;
    private String cpu;
    public ServerImpl (String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public Computer createComputer() {
        return new Server(ram,hdd,cpu);
    }
}

