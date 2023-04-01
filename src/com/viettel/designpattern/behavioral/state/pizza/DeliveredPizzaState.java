package com.viettel.designpattern.behavioral.state.pizza;

public class DeliveredPizzaState implements PizzaState{

    private Pizza pizza;

    public DeliveredPizzaState(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public void bake() throws Exception {

    }

    @Override
    public void deliver() throws Exception {

    }
}
