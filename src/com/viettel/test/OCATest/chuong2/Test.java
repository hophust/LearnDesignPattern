package com.viettel.test.OCATest.chuong2;

public class Test {
    public static void main(String[] args) {
        //double num1, int num2=0;
//        int num1, num2;
//        int num1, num2=0;
//        int num1=0, num2=0;
        //String chair, talbe = "metal";
       // chair = chair + talbe; Variable 'chair' might not have been initialized
        //System.out.println(chair);

        //int num = _9_9_9; error
        //System.out.println(num);
        String testInterge = "5";
        Integer.valueOf(testInterge);
        Integer int1 = new Integer(5);
        //int i = Integer.parseInt(int1);
        int test = int1;
        Integer test2 = test;
        int test3 = new Integer(5);
        //System.out.println(i.byteValue());
        double d = new Double(1_000_000.00);

    }

    public String convert(Integer value) {
        return value.toString();
    }

}
