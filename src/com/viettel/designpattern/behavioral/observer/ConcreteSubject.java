package com.viettel.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ConcreteSubject implements Subject{
    double d;
    List<Observer> observers = new ArrayList<>();
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observers.indexOf(observer));
    }
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
    public void operation() {
        Random random = new Random();
        d = random.nextDouble();
        if (d < 0.25 || d > 0.75) {
            System.out.print("Yes");
            notifyObservers();
        } else {
            System.out.print("No");
        }
    }

}
