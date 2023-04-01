package com.viettel.designpattern.creational.singleton;

// nhanh va hieu qua nhat
// hibernate co su dung cach nay
public class BillPughSingleton {
    private static class SingletonHelper {
        private static final BillPughSingleton instance = new BillPughSingleton();

    }

    private BillPughSingleton() {
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.instance;
    }

}
