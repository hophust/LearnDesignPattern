package com.viettel.test.OCA.chuong4;

public class RopeSwing {
    private static final String leftRope;
    private static final String rightRope;
    //private static final String bench; can duoc khoi tao o day hoac trong khoi static
    private static final String name = "name";

    static {
        leftRope = "left";
        rightRope = "right";
    }

    static {
        //name = "name";
        //rightRope = "right";
    }

    private static Rope rope1 = new Rope();
    private static Rope rope2 = new Rope();

    {
        System.out.println(rope1.length);
    }

    public static void main(String[] args) {
        //RopeSwing ropeSwing = new RopeSwing();
        rope1.length = 2;
        rope2.length = 8;
        System.out.println(rope1.length);
        ////////////
        //bench = "bench"; khong duoc phep thay doi bien final da gan gia tri
    }
}
