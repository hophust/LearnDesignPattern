package com.viettel.designpattern.behavioral.state.document.improve;

public class NewState implements State {

	@Override
	public void handleRequest() {
		System.out.println("Create a new document");
	}
}
