package com.viettel.designpattern.behavioral.observer.trackingaccount;

public class Logger implements Observer {

	@Override
	public void update(User user) {
		System.out.println("Logger: " + user);
	}
}