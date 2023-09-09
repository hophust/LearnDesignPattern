package com.viettel.designpattern.behavioral.observer.trackingaccount;

public interface Subject {

	void attach(Observer observer);

	void detach(Observer observer);

	void notifyAllObserver();
}