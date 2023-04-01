package com.viettel.test.OPC11Part2.chuong8;

import java.io.*;

public class MarkResetSkipInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Administrator\\Downloads\\DSFMRA\\Design Pattern\\src\\com\\viettel\\test\\OPC11Part2\\chuong8\\test.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        readData(bufferedInputStream);
    }
    public static void readData(InputStream intputStream) throws IOException {
        System.out.println((char) intputStream.read());
        if(intputStream.markSupported()) {
            intputStream.mark(100);
            intputStream.skip(2);
            System.out.println((char) intputStream.read());
            System.out.println((char) intputStream.read());
            intputStream.reset();
        }
        System.out.println((char) intputStream.read());
        System.out.println((char) intputStream.read());
        System.out.println((char) intputStream.read());
    }
}
