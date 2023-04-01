package com.viettel.designpattern.behavioral.visitor.singledispatch;

public class SingleDispatchExample {
    public static void main(String[] args) {
        Book book = new ProgramingBook(); // (1)
        Customer gpcoder = new Developer();
        gpcoder.buy(book);

        ProgramingBook programingBook = new ProgramingBook(); // (2)
        gpcoder.buy(programingBook); // Developer buy a Programing Book
    }
}
