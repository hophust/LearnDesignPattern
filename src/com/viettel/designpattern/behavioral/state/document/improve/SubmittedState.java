package com.viettel.designpattern.behavioral.state.document.improve;

public class SubmittedState implements State {

	@Override
	public void handleRequest() {
		System.out.println("Submitted");
	}
}