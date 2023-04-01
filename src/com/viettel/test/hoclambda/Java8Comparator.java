package com.viettel.test.hoclambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Java8Comparator {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person(1,"hopnv"));
        personList.add(new Person(5,"hoangnt21"));
        personList.add(new Person(2,"laipt3"));
        personList.add(new Person(3,"thaolt34"));
        personList.add(new Person(6,"yuannm33"));

        System.out.println("----------------List chua sap xep-----------------------------");
        personList.forEach(person -> {
            System.out.println(person.getId() + "---" + person.getName());
        });

        System.out.println("----------------List da sap xep theo id theo thu tu tang dan dung ham sort trong java 8-----------------------------");
        personList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getId() - o2.getId();
            }
        });
        personList.forEach(person -> {
            System.out.println(person.getId() + "---" + person.getName());
        });

        System.out.println("----------------List da sap xep theo id dung expression lambda trong java 8: lam nhu the nay rat ngan gon-----------------------------");
        personList.sort((p1, p2) -> {
            return p1.getId() - p2.getId();
        });
        personList.forEach(person -> {
            System.out.println(person.getId() + "---" + person.getName());
        });

        System.out.println("----------------List da sap xep theo tuoi dung expression lambda trong java 8: lam nhu the nay rat ngan gon-----------------------------");
        personList.sort((p1, p2) -> {
            return p1.getName().compareTo(p2.getName());
        });
        personList.forEach(person -> {
            System.out.println(person.getId() + "---" + person.getName());
        });
    }
}
