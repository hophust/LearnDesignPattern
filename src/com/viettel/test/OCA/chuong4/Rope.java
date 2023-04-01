package com.viettel.test.OCA.chuong4;

public class Rope {

    public static int length=0;
    public int bienGoiTrongPhuongThucStatic;

    /*void Rope(){}*/

   /* public Rope(int bienGoiTrongPhuongThucStatic) {
        this.bienGoiTrongPhuongThucStatic = bienGoiTrongPhuongThucStatic;
    }*/

    public static void swing() {
        System.out.print("swing ");
    }

    public void climb() {
        System.out.println("climb ");
    }

    public static void play() {
        swing();
        //climb();
    }

    public static void main(String[] args) {
        Rope rope = new Rope();
        rope.play();
        Rope rope2 = null;
        rope2.play();
        Rope.play();
    }
}
