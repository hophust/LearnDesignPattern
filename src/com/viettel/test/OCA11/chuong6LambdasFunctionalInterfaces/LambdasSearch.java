package com.viettel.test.OCA11.chuong6LambdasFunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;

public class LambdasSearch {
    public static void main(String[] args) {
        List animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));
        print(animals,animal -> animal.canHop());
    }

    private static void print(List<Animal> animals,
                              CheckTrait checker) {
        for (Animal animal : animals) {

            // the general check
            if (checker.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println();
    }
}
