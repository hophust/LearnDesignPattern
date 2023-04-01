package com.viettel.test.OCA11.chuong12ReusingImplementationsThroughInheritance.overridingmethod;

public class Juicer {
    public void crush(Fruit f){
        if(f instanceof Mango){
            System.out.println("mango");
        } else {
            System.out.println("not mango");
        }
    }

    public static void main(String[] args) {
        new Juicer().crush(new Mango());
        new Juicer().crush(new Apple());
    }
}
