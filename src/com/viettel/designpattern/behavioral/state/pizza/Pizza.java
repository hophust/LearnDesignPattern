package com.viettel.designpattern.behavioral.state.pizza;

public class Pizza {
    PizzaState cookedState;
    PizzaState bakedState;
    PizzaState deliveredState;

    private String name;

    //State initialization
    private PizzaState state = cookedState;

    public Pizza() {
        cookedState = new CookedPizzaState(this);
        bakedState = new BakedPizzaState(this);
        deliveredState = new DeliveredPizzaState(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PizzaState getState() {
        return state;
    }

    public void setState(PizzaState state) {
        this.state = state;
    }

    public void bake() throws Exception {
        this.state.bake();
    }

    public void deliver() throws Exception {
        this.state.deliver();
    }

    public PizzaState getCookedState() {
        return cookedState;
    }

    public PizzaState getBakedState() {
        return bakedState;
    }

    public PizzaState getDeliveredState() {
        return deliveredState;
    }
}

