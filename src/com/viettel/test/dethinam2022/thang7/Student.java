package com.viettel.test.dethinam2022.thang7;

public class Student implements Comparable{
    private String name;
    private int tuoi;

    public Student(String name, int tuoi) {
        this.name = name;
        this.tuoi = tuoi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
