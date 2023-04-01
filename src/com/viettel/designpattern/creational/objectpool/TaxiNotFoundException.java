package com.viettel.designpattern.creational.objectpool;

public class TaxiNotFoundException extends Throwable {
    private static final long serialVersionUID = -6670953536653728443L;

    public TaxiNotFoundException(String message) {
        System.out.println(message);
    }
}
