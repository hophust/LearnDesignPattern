package com.viettel.designpattern.creational.factory.database;

public class Client {
    public static void main(String[] args) {
        Connection connection = ConnectionFactory.getConnection(ConnectionType.MYSQL);
        System.out.println(connection.connection());
    }
}
