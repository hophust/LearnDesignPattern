package com.viettel.test.OCA11.chuong12ReusingImplementationsThroughInheritance.overridingmethod;


public class TestIsA {
    public static void main(String[] args) {
        Apple apple =new Apple();
        Mango mango = new Mango();
        Fruit f1 = apple;// ok boi vi Apple la 1 Fruit
        Fruit f2 = mango;//ok boi vi Mango la 1 Fruit
        //apple = f1;//not ok because tat ca trai cay khong phai deu la tao\
        apple = (Apple) f1;
        int test =5;
        double test1 = test;//ok vi viec lam trong so khong lam mat thong tin
        int test2 = (int) test1;// phai ep kieu vi no lam mat thong tin


        //Fruit f = new Mango();
        //Poisonous p = (Poisonous) f;

        Fruit starFruit = new StarFruit();
        Poisonous p1 = (Poisonous) starFruit;

        String a = new String();

        Apple apple1 = new Apple();
        System.out.println(apple1.count);
        System.out.println(((Fruit)apple1).count);
        Fruit fruit = apple1;
        System.out.println(fruit.count);

        Account account = new DummyAccount(100.0);

    }
}
