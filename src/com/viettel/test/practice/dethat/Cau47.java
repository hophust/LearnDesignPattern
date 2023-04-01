package com.viettel.test.practice.dethat;
 class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}

public class Cau47 {
    public static void main(String[] args) {
        Person p = new Person("Joe");
        checkPerson(p);
        System.out.println(p);
        p = null;
        checkPerson(p);
        System.out.println(p);
    }
    // ban chat la tao ra 1 tham chieu moi va tro den dia chi nay, nen khi tham chieu moi tro den dia chi moi thi dia cu van con
    public static Person checkPerson(Person p) {
        if(p == null) {
            p = new Person("Mary");
        }else {
            p = null;
        }
        return p;
    }
}

