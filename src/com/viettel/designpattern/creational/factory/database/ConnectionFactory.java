package com.viettel.designpattern.creational.factory.database;

public class ConnectionFactory {
    private ConnectionFactory(){};
    public static final Connection getConnection(ConnectionType connectionType){
        switch (connectionType) {
            case MYSQL:
                return new MySQLConnection();
            case ORACLE:
                return new OracleConnection();
            case SQLSERVER:
                return new SqlServerConnection();
            default:
                return new OracleConnection();
        }
    }

}
