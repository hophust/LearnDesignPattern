package com.viettel.designpattern.creational.factory.modemwifi;

public class VendorFactory {
    private VendorFactory(){}
    public static final Vendor getVendor(VendorType vendorType){
        switch (vendorType){
            case HUAWEI:
                return new Huawei();
            case ZTE:
                return new ZTE();
            case VHT:
                return new VHT();
            default:
                throw  new IllegalArgumentException("Exception");
        }
    }
}
