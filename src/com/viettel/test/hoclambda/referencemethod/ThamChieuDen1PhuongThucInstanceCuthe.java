package com.viettel.test.hoclambda.referencemethod;

interface ExecuteFunction2{
    public int execute(int a, int b);
}

class MathUtils {
    public int sum(int a, int b) {
        return a +b;
    }
    public int minus(int a, int b)  {
        return a -b;
    }
}

public class ThamChieuDen1PhuongThucInstanceCuthe {
    public static void main(String[] args) {
        int a = 10;
        int b = 6;
        MathUtils mathUtils2 = new MathUtils();
        int sum = doAction(a,b, mathUtils2::sum);
        System.out.println(a + " + " + b + " = " +sum);

        int minus = doAction(a,b,mathUtils2::minus);
        System.out.println(a + " - " + b +" = " +minus);
    }

    public static int doAction(int a, int b, ExecuteFunction2 excuteFunction2) {
        return excuteFunction2.execute(a, b);
    }
}
