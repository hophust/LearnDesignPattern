package com.viettel.designpattern.creational.factory.database;

public class SqlServerConnection implements Connection {
    @Override
    public String connection() {
        return "SqlServer";
    }
}
