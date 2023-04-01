package com.viettel.test.OCA11.chuong12ReusingImplementationsThroughInheritance.overridingmethod;

public class CompoundInterestCalculator extends InterestCalculator {
    public Double computeInterest(double principle, double yrs, double rate){
        return principle*Math.pow(1 + rate, yrs) - principle;
    }

    public final int testSuperMethod1(){
        return 5;
    }
    public final int testFianl=5;
    public int yrs = 20;
    public static double rate = 0.2;
    public static String getClassName(){
        return "CompoundInterestCalculator";
    }

}
