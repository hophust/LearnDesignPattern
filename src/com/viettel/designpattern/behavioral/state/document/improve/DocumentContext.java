package com.viettel.designpattern.behavioral.state.document.improve;

public class DocumentContext {

	private State state;

	public void setState(State state) {
		this.state = state;
	}

	public void applyState() {
		this.state.handleRequest();
	}
}
