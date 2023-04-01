package com.viettel.designpattern.behavioral.memento;

public class Caretaker {
    private java.util.Stack<Memento> saveList = new java.util.Stack<>();

    public void add(Memento memento) {
        saveList.push(memento);
    }

    public Memento get() {
        return saveList.isEmpty() ? null : saveList.pop();
    }

}
