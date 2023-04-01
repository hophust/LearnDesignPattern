package com.viettel.designpattern.behavioral.memento;

public class Client {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Product product = new Product("Book", 50.00);
        System.out.println(product);
        System.out.println("Change the object: ");
        caretaker.add(product.createMemento());
        product.setName("Meat");
        caretaker.add(product.createMemento());
        product.setCost(60.00);
        System.out.println(product);
        System.out.println("Restore state via the 	memento...");
        product.setMemento(caretaker.get());
        System.out.println(product);
        product.setMemento(caretaker.get());
        System.out.println(product);
    }

}
