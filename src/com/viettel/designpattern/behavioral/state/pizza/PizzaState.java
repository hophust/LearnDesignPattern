package com.viettel.designpattern.behavioral.state.pizza;

public interface PizzaState {
    void bake() throws Exception;

    void deliver() throws Exception;
}
