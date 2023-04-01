package com.viettel.test.practice.de4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    public static enum Grade {A, B, C, D, F}

    private String name;
    private Grade grade;

    public Student(String name, Grade grade) {
        this.name = name;
        this.grade = grade;
    }

    public String toString() {
        return name + ":" + grade;
    }     //getters and setters not shown

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}

public class Cau43 {
    public static void main(String[] args) {
        List<Student> ls = Arrays.asList(new Student("S1", Student.Grade.A), new Student("S2", Student.Grade.A), new Student("S3", Student.Grade.C));
        Map<Student.Grade, List<String>> map = ls.stream().collect(Collectors.groupingBy(Student::getGrade,Collectors.mapping(Student::getName,Collectors.toList())));
        System.out.println(map);
    }
}
