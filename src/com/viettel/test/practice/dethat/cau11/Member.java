package com.viettel.test.practice.dethat.cau11;

public class Member {
    private String name;
    private String yearMemberShip;
    public void print(){

    }

    public Member(String name, String yearMemberShip) {
        this.name = name;
        this.yearMemberShip = yearMemberShip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearMemberShip() {
        return yearMemberShip;
    }

    public void setYearMemberShip(String yearMemberShip) {
        this.yearMemberShip = yearMemberShip;
    }
}
