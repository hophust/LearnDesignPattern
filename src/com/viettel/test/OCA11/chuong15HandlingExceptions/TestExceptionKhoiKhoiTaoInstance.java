package com.viettel.test.OCA11.chuong15HandlingExceptions;

import java.io.IOException;

public class TestExceptionKhoiKhoiTaoInstance {
    int i = 5;

    {
        if (i == 0) throw new IOException();
    }

    TestExceptionKhoiKhoiTaoInstance() throws Exception {
    }
}
