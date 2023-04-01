package com.viettel.test.OCATest.chuong7;

abstract class Triangle {
    abstract String getDescription();
}
class RightTriangle extends Triangle {
    protected String getDescription() { return "rt"; } // g1
}
public class IsoscelesRightTriangle extends RightTriangle { // g2
    public String getDescription() { return "irt"; }
    public static void main(String[] edges) {
        final Triangle shape = new RightTriangle(); // g3
        System.out.print(shape.getDescription());
    }
}
