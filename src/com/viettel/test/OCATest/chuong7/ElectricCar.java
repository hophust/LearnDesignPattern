package com.viettel.test.OCATest.chuong7;

class Automobile {
    public static void test(){}
    private final String drive() { return "Driving vehicle"; }
}
class Car extends Automobile {
    public static void test(){}
    protected String drive() { return "Driving car"; }
}
public class ElectricCar extends Car {
    public final String drive() { return "Driving electric car"; }
    public static void main(String[] wheels) {
        final Car car = new ElectricCar();
        System.out.print(car.drive());
    }
}

