package com.viettel.designpattern.structural.composite;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        FileComponent fileComponent = new FileLeaf("file1" ,10);
        FileComponent fileComponent1 = new FileLeaf("file2",20);
        FileComponent fileComponent2 = new FileLeaf("file3",30);

        List<FileComponent> fileList = Arrays.asList(fileComponent,fileComponent1,fileComponent2);
        FileComponent folder = new FolderComposite(fileList);
        folder.showProperty();
        System.out.println("Total size: " + folder.totalSize());

    }
}
