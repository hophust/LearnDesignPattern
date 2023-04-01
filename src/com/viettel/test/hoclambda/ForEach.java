package com.viettel.test.hoclambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hopnv 1");
        list.add("hopnv 2");
        list.add("hopnv 3");
        list.add("hopnv 4");
        list.add("hopnv 5");

        for (String s: list) {
            System.out.println(s);
        }

        System.out.println("-----------------------------Dung foreach + lambda--------------------");
        System.out.println("-----------------------------Bien s tuong ung voi tung phan tu trong vong lap--------------------");
        list.forEach(s -> {
            System.out.println(s);
        });

        System.out.println("------------------------------Dung lamda voi list-----------------------------------------");
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person(1,"hopnv"));
        personList.add(new Person(1,"hoangnt21"));
        personList.add(new Person(1,"laipt3"));
        personList.add(new Person(1,"thaolt34"));
        personList.add(new Person(1,"tuannm33"));
        personList.forEach(person -> {
            System.out.println(person.getName());
        });

        System.out.println("-------------------------------Dung lambda voi map----------------------------------------");
        Map<Integer,String> integerStringMap = new HashMap<>();
        integerStringMap.put(1,"hopnv");
        integerStringMap.put(2,"hoangnt21");
        integerStringMap.put(3,"laipt3");
        integerStringMap.put(4,"thaolt23");
        integerStringMap.put(5,"tuannm22");
        integerStringMap.forEach((k,v)->{
            System.out.println(k + "---" +v);
        });
    }
}
