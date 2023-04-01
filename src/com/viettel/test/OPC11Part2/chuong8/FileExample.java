package com.viettel.test.OPC11Part2.chuong8;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        var file = new File("c:\\data\\zoo.txt");
        file.mkdirs();
        //file.mkdir();
        System.out.println("File Exists: " + file.exists());
        if (file.exists()) {
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Parent Path: " + file.getParent());
            if (file.isFile()) {
                System.out.println("Size: " + file.length());
                System.out.println("Last Modified: " + file.lastModified());
            } else {
                for (File subfile : file.listFiles()) {
                    System.out.println(" " + subfile.getName());
                }
            }
        }

    }
}
