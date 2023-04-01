package com.viettel.test.OCA11.chuong12ReusingImplementationsThroughInheritance.overridingmethod;

public class InterestCalculator {
    Number computeInterest(double principle, double yrs, double rate) throws Exception {
        if (yrs < 0) throw new IllegalArgumentException("yrs should be > 0");
        return principle * yrs * rate;
    }
    public final int testSuperMethod(){
        return 5;
    }
    public final int testFianl=5;
    public int yrs = 10;
    public static double rate = 0.1;
    public static String getClassName(){
        return "InterestCalculator";
    }
}
