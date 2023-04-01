package com.viettel.test.OCATest.chuong7;

abstract class Parallelogram {
    private int getEqualSides() {return 0;}
}
abstract class Rectangle extends Parallelogram {
    public static int getEqualSides() {return 2;} // x1
}
public final class Square extends Rectangle {
    public static int getEqualSides() {return 4;} // x2
    public static void main(String[] corners) {
        final Rectangle myFigure = new Square(); // x3
        System.out.print(myFigure.getEqualSides());
    }
}
