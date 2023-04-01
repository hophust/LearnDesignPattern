package com.viettel.test.practice.de1;

import java.util.function.*;

class Employee {
    int age;
}

public class Cau32 {
    public static void main(String[] args) {
        Employee e = new Employee();
        Supplier<Employee> se = () -> {
            e.age = 40;
            return e;
        }; //1
        e.age = 50;//2
        System.out.println(se.get().age); //3
    }
}