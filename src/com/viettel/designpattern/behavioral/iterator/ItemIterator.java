package com.viettel.designpattern.behavioral.iterator;

public interface ItemIterator<T> {
    boolean hasNext();
    T next();
}
