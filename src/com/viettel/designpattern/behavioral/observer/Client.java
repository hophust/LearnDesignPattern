package com.viettel.designpattern.behavioral.observer;

public class Client {
    public static void main(String[] args) {
        System.out.println("--- Observer Pattern ---");
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver(subject);
        Observer observer2 = new ConcreteObserver(subject);
        System.out.println("Doing something in the subject      over time...");
        System.out.println(" Observable Observer1 Observer2");
        System.out.println("Iteration changed? notified? notified?");
        for (int i = 0; i < 10; ++i) {
            System.out.print(i + ": ");
            subject.operation();
            System.out.println();
        }
        System.out.println("Removing observer1 from the subject... Repeating...");
        System.out.println(" Observable Observer2");
        System.out.println("Iteration changed? notified?");
        subject.deleteObserver(observer1);
        for (int i = 0; i < 10; ++i) {
            System.out.print(i + ": ");
            subject.operation();
            System.out.println();
        }

    }

}
