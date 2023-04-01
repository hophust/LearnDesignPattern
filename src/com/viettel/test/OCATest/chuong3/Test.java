package com.viettel.test.OCATest.chuong3;

public class Test {
    public String runTest(boolean spinner, boolean roller) {
        if(spinner = roller) return "up";
        else return roller ? "down" : "middle";
    }
    public static void main(String[] args) {
        /*long dayOfWeek= 0;
        final long saturday = 6;
        switch(dayOfWeek) {
            default:
                System.out.print("Another Weekday");
                break;
            case saturday:
                System.out.print("Weekend!");
        }*/

        final Test tester = new Test();
        System.out.println(tester.runTest(false,true));

    }
}
