package com.viettel.designpattern.behavioral.memento;

public class Memento {
    private String name;
    private double cost;

    public Memento(Product product) {
        this.name = product.getName();
        this.cost = product.getCost();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

}
