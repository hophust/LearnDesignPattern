package com.viettel.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class FolderComposite implements FileComponent{
    private List<FileComponent> fileComponentList = new ArrayList<>();

    public FolderComposite(List<FileComponent> files) {
        this.fileComponentList = files;
    }

    @Override
    public void showProperty() {
        for (FileComponent file: fileComponentList) {
            file.showProperty();
        }
    }

    @Override
    public long totalSize() {
        long total =0;
        for (FileComponent file: fileComponentList) {
            total += file.totalSize();
        }
        return total;
    }
}
