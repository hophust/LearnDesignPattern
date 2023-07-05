package com.viettel.designpattern.creational.factory.tree;

import java.util.Random;

public class TayNguyenImpl implements GiongCayTrongInteface {
    @Override
    public Giong chonGiong() {
        Random chonGiongNgauNhien = new Random(3);

        switch (chonGiongNgauNhien.nextInt()) {
            case 0:
                return new CaPhe();
            case 1:
                return new Tieu();
            case 2:
                return new CaoSu();
            default:
                return null;
        }
    }
}
