package com.viettel.designpattern.behavioral.state.pizza;

public class BakedPizzaState implements PizzaState {

    private Pizza pizza;

    public BakedPizzaState(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public void bake() throws Exception {

    }

    @Override
    public void deliver() throws Exception {

    }
}
