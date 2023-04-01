package com.viettel.test.hoclambda.predicate;

public class Employee {
    private Integer id;
    private Integer age;
    private String gender;
    private String firstName;
    private String lastName;

    public Employee(Integer id, Integer age, String gender, String fName, String lName) {
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.firstName = fName;
        this.lastName = lName;
    }

    @Override
    public String toString() {
        return this.id.toString() + " - " + this.age.toString();
    }

    // Please generate Getter and Setters
}
