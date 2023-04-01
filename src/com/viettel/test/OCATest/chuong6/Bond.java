package com.viettel.test.OCATest.chuong6;
import static com.viettel.test.OCATest.chuong6.useful.MathHelper.*;
public class Bond {
    private static int price = 5;
    public boolean sell() {
        if(price<10) {
            price++;
            return true;
        } else if(price>=10) {
            return false;
        }
        return false;
    }
    public static void main(String[][] cash) {}
    public static void main(String[] cash) {
        //com.viettel.test.OCATest.chuong6LambdasFunctionalInterfaces.useful.MathHelper.roundValue(6);
        roundValue(6);
        new Bond().sell();
        new Bond().sell();
        new Bond().sell();
        System.out.print(price);
    }
}
