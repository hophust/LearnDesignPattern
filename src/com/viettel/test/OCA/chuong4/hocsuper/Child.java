package com.viettel.test.OCA.chuong4.hocsuper;

public class Child extends Parent {
    public Child(){
        System.out.println("Child khong co tham so");
    }
    public Child(String website){
        super(website);
        System.out.println("Child có tham so");
    }

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("---------------");
        Child child1 = new Child("hopnv.com");
    }
}
