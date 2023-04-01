package com.viettel.test.OCA11.chuong13ProgrammingAbstractlyThroughInterfaces;

public class Process implements Task, Activity{
    @Override
    public void doIt() {

    }

    @Override
    public void doIt2() {

    }

    public static void main(String[] args) {
        Process process = new Process();
        process.doIt2();
        System.out.println(Activity.SIZE);
        System.out.println(Task.SIZE);
    }
}
