package com.viettel.designpattern.creational.factory.database;

public class OracleConnection implements Connection {
    @Override
    public String connection() {
        return "Oracle";
    }
}
