package com.viettel.designpattern.behavioral.visitor.singledispatch;

public interface Customer {
    void buy(Book book);

    void buy(ProgramingBook book);

    void buy(BusinessBook book);
}
