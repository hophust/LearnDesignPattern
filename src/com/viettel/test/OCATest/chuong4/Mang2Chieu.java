package com.viettel.test.OCATest.chuong4;

public class Mang2Chieu {
    public static void main(String[] args) {
        short[][] mang2ChieuCo5Dong10Cot = new short[5][10];
        short[][] mang2ChieuCo5DongSoCotKhongCoDinh = new short[5][];
        short[][] mang2ChieuChiDinhCacPhanTu = new short[][] {
                {3,4,5},
                {6,7,8}
        };
        System.out.println("Khoi tạo giá trị của mảng 2 chiều");
        for (short row = 0; row < mang2ChieuCo5Dong10Cot.length; row++) {
            for (short col = 0; col < mang2ChieuCo5Dong10Cot[row].length; col++) {
                mang2ChieuCo5Dong10Cot[row][col] = (short) (row + col);
            }
        }

        System.out.println("Hiển thị giá trị khau khi khỏi tạo");
        for (short row = 0; row < mang2ChieuCo5Dong10Cot.length; row++) {
            for (short col = 0; col < mang2ChieuCo5Dong10Cot[row].length; col++) {
                System.out.println("arr[" +row + "," +col +"]= "+mang2ChieuCo5Dong10Cot[row][col]);
            }
        }

       /* mang2ChieuCo5DongSoCotKhongCoDinh[0] = new short[] {1,2,3};
        mang2ChieuCo5DongSoCotKhongCoDinh[1] = new short[] {5,6,7,8,9};
        for (int row = 0; row < mang2ChieuCo5DongSoCotKhongCoDinh.length; row++) {
            for (int col = 0; col < mang2ChieuCo5DongSoCotKhongCoDinh[row].length; col++) {
                System.out.println("Gía trị tại [" +row +","+col+"]=" + mang2ChieuCo5DongSoCotKhongCoDinh[row][col]);
            }
        }*/


        System.out.println("Test khoi tao mang 2 chieu");

        int[] testDauNgoacSaubien[] = new int[0][9];
        char[][] blocks = new char[][] { { 'a', 'b', 'c' }, { 'd' }, { 'e', 'f' } };
        for (int row = 0; row < blocks.length; row++) {
            for (int col = 0; col < blocks[row].length; col++) {
                System.out.println("block[" + row +"," + col+"]=" +blocks[row][col]);
            }
        }
    }
}
