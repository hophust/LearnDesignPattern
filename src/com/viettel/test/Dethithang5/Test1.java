package com.viettel.test.Dethithang5;

abstract class Animal {
    public int tuoil;
    private String name;

    Animal() {

    }

    Animal(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    private String breed;

    Dog(String breed) {
        this.breed = breed;
    }

    Dog(String name, String breed) {
        super();// goi truc tiep constructor cua lớp cha gần nhất
        int tuoi = super.tuoil;
        super.getName();
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Beagle");
        Dog dog2 = new Dog("Bubbly", "Poodle");
        System.out.println(dog1.getName() + ":" + dog1.getBreed() + ":" +
                dog2.getName() + ":" + dog2.getBreed());
    }
}
