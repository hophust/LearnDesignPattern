package com.viettel.test.OCA11.chuong12ReusingImplementationsThroughInheritance;

public class SubClass extends SuperClass{
    public int superClassInt = 11;
    //public static int superClassStaticVar = 15;
    @Override
    public int getSupeClassInstance(){
        return 12;
    }

   /* public static int getSupeClassStatic(){
        return 13;
    }*/

    public static void main(String[] args) {
        SuperClass superClass = new SubClass();
        System.out.println(superClass.superClassInt);
        System.out.println(superClass.superClassStaticVar);
        System.out.println(superClass.getSupeClassInstance());
        System.out.println(superClass.getSupeClassStatic());

        SubClass subClass = new SubClass();
        System.out.println(subClass.superClassInt);
        System.out.println(subClass.superClassStaticVar);
        System.out.println(subClass.getSupeClassInstance());
        System.out.println(subClass.getSupeClassStatic());
    }
}
