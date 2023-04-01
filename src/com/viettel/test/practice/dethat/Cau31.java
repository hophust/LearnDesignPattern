package com.viettel.test.practice.dethat;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.JDBCType;
import java.sql.SQLException;

public class Cau31 {
    void storePair(Connection conn) throws SQLException {
        CallableStatement cStmt = conn.prepareCall("(call STORE_PAIR (?,?))");
        cStmt.setObject("blue", "one", JDBCType.VARCHAR);
        cStmt.setObject("gold", "two", JDBCType.VARCHAR);
        cStmt.execute();
    }

}
