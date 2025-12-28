package com.viettel.designpattern.creational.factory.modemwifi;


public class Client {
    public static void main(String[] args) {
        Vendor vendor = VendorFactory.getVendor(VendorType.HUAWEI);
        System.out.println(vendor.doiMatkhau());
    }
}
