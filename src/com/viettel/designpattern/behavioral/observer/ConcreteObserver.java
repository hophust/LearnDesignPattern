package com.viettel.designpattern.behavioral.observer;

public class ConcreteObserver implements Observer {
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
        this.subject.addObserver(ConcreteObserver.this);
    }

    @Override
    public void update() {
        System.out.printf(" [%.2f]", subject.d);

    }
}
