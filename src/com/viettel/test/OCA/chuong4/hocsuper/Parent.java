package com.viettel.test.OCA.chuong4.hocsuper;

public class Parent {
    private String website;
    public Parent(){
        System.out.println("Parent khong co tham so");
        print();
    }

    public Parent(String website){
        this.website = website;
        System.out.println("Parent có tham so");
        print();
    }

    public void print(){
        System.out.println("website = " + website);
    }
}
