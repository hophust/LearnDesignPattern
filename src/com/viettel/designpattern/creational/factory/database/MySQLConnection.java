package com.viettel.designpattern.creational.factory.database;

public class MySQLConnection implements Connection{
    @Override
    public String connection() {
        return "Mysql";
    }
}
