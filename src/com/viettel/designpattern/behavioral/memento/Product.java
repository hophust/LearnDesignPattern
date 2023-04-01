package com.viettel.designpattern.behavioral.memento;

// Originator
public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
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

    @Override
    public String toString() {
        return String.format("%s [%.2f]", name, cost);
    }

    public Memento createMemento() {
        return new Memento(this);
    }

    public void setMemento(Memento memento) {
        this.setName(memento.getName());
        this.setCost(memento.getCost());
    }
}
