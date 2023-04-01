package com.viettel.test.practice.dethat.cau7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.*;

public class Cau7 {
    public static void main(String[] args) {
        try {
            String source = "C:\\Users\\Administrator\\Downloads\\DSFMRA\\Design Pattern\\src\\com\\viettel\\test\\practice\\dethat\\cau7\\stage\\message.txt";
            String destination = "C:\\Users\\Administrator\\Downloads\\DSFMRA\\Design Pattern\\src\\com\\viettel\\test\\practice\\dethat\\cau7\\message.txt";
            Files.move(Paths.get(source),Paths.get(destination), StandardCopyOption.REPLACE_EXISTING);
            //Files.copy(Paths.get(source),Paths.get(destination), StandardOpenOption.CREATE_NEW);
            try(FileChannel in = new FileInputStream(source).getChannel();FileChannel out = new FileOutputStream(destination).getChannel()){
                in.transferTo(0,in.size(),out);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
