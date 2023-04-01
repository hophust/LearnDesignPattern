package com.viettel.test.OCA11.chuong10CreatingandUsingMethods;
class Data{
    int value =10;
}
public class methodReturnValue {

    public int get2X(int X) {
        short y = 5;
        return y;
    }

    public int getVal(){
//        return new Integer(5);
        short tes = 6;
        return new Short(tes);
    }

    public Object getValue(){
        return 10;
    }

    public static int average(int... test) {
        int sum = 0;
        for (int i = 0; i <test.length; i++) {
            sum += test[i];
        }
        return sum;
    }

    void process(int a, String b) {

    }

    public static int doAdd(int a, short b) {
        return a + b;
    }

    public static int doAdd(Integer a, Short b) {
        return a + b;
    }

    public static void inChar(char c) {
        System.out.println("in char");
    }

    public static void processData(float c) {
        System.out.println("short = " +c);
    }

    public static void processData(Byte c) {
        System.out.println("Byte = " +c);
    }

    public static Data modifyData(Data d) {
        d = new Data();
        d.value = 2*d.value;
        return d;
    }

    public static void main(String[] args) {
//        System.out.println(average());
        /*int a = 5;
        short b = 6;
        System.out.println(doAdd(a+b));*/
        /*byte c = 5;
        char d = 10;
        int f = 10;
        inChar(d);*/
        //processData((byte) 5);
        Data d  = new Data();
        modifyData(d);
        System.out.println(d.value);
        System.out.println("hello");
    }

}
