package com.viettel.designpattern.behavioral.command.quanlyvanban;

import java.util.Stack;

// lop cung cap phuong thuc de ghi them dong hoac xoa dong da ghi truoc do
public class Document {
    private Stack<String> lines = new Stack<>();

    public void write(String text) {
        lines.push(text);
    }

    public void eraseLast() {
        if (!lines.isEmpty()) {
            lines.pop();
        }
    }

    public void readDocument() {
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
