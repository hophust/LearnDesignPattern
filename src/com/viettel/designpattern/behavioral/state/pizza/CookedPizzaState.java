package com.viettel.designpattern.behavioral.state.pizza;

public class CookedPizzaState implements PizzaState{
    private Pizza pizza;

    public CookedPizzaState(Pizza pizza) {
        this.pizza = pizza;
    }

    public void bake() throws Exception {
        System.out.print("Baking the pizza...");
        pizza.setState(pizza.getBakedState());
    }

    public void deliver() throws Exception {
        throw new Exception("Can't deliver a pizza not baked yet");
    }
}
