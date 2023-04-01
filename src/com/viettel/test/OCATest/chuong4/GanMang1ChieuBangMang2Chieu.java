package com.viettel.test.OCATest.chuong4;

public class GanMang1ChieuBangMang2Chieu {
    static int[][] game = new int[6][6];

    public static void main(String[] args) {
        game[3][3] = 6;
        Object[] obj = game;
        obj[3] = "X";
        System.out.println(game[3][3]);
    }


}
