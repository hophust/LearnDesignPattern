package com.viettel.test.OCATest.chuong8;

public class ThrowableCoTheXuatHienTrongCatch {
    public static void main(String[] args) {
        try {
            int score = 1;
            System.out.print(score++);
        } catch (Throwable t) {
            //System.out.print(score++);
        } finally {
            //System.out.print(score++);
        }
        //System.out.print(score++);

    }
}
