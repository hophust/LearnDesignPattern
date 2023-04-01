package com.viettel.test.hoclambda.referencemethod;

@FunctionalInterface
interface ExcuteFunction{
    public int excute(int a, int b);
}

class Outer {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int minus(int a, int b){
        return a - b;
    }
}
public class ThamChieuDenMotPhuongThucStatic {
    public static void main(String[] args) {
        // Neu ta goi 1 phuong thức có 1 tham số là function interface
        // thì ta có thể truyền vào 1 phương thức tham chiếu có cấu trúc
        // giống với cấu trúc phương thức đã định nghĩa trong fuction interface
        int sum = doAction(5,3,Outer::add);
        System.out.println("Tong la " +sum);
    }

    public static int doAction(int a, int b, ExcuteFunction ex){
        return ex.excute(a,b);
    }
}
