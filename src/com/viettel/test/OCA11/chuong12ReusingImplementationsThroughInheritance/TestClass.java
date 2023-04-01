package com.viettel.test.OCA11.chuong12ReusingImplementationsThroughInheritance;

public class TestClass {

    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();
        person.name="Hop";
        employee.name="Nguyen";
        System.out.println(person.name + "-" + employee.name);
        Employee.personCount = 2;
        System.out.println(Person.personCount +"-" + Employee.personCount);
    }
}
