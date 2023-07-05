package com.viettel.designpattern.creational.factory.tree;

public class Client {
    public static void main(String[] args) {
        System.out.println("Chọn giống cho 12 nông dân ở Tây Nguyên");
        GiongCayTrongInteface tayNguyen = new TayNguyenImpl();
        for (int i = 1; i <= 12; i++) {
            Giong giongDuocChon = tayNguyen.chonGiong();
            System.out.println(String.format("Nguời thứ %d nhận giống %s", i, giongDuocChon.showTenGiong()));
        }
        System.out.println("-----");
        System.out.println("Chọn giống cho 12 nông dân ở Đồng bằng sông Cửu Long");
        GiongCayTrongInteface dbSCL = new DBSongCuuLongImpl();
        for (int i = 1; i <= 12; i++) {
            Giong giongDuocChon = dbSCL.chonGiong();
            System.out.println(String.format("Nguời thứ %d nhận được giống của %s", i, giongDuocChon.showTenGiong()));
        }
    }

}
