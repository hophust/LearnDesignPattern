package com.viettel.test.dethinam2022.thang7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Cau12 {
    public static void copy(String record1, String record2) throws IOException {
        try {
            InputStream is = new FileInputStream(record1);
        } catch (IOException | IndexOutOfBoundsException e) {
            //e = new FileNotFoundException();
            e.printStackTrace();
        }
        String test = "";
        test.substring(8,12);
    }
}
