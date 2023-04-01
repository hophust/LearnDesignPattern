package com.viettel.test.OCA11.chuong2;

public class Account {
    private String name;

    public Account() {
    }

    public Account(String name) {
        this.name = name;
    }

    public void open() {
        var varInMethod = "varInMethod";
        System.out.println("Account [" + name + "] Opened\n");
    }

    public void close() {
        System.out.println("Account [" + name + "] Closed\n");
    }
}
