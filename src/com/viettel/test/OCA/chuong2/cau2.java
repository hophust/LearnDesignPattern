package com.viettel.test.OCA.chuong2;

public class cau2 {
    public static void main(String[] args) {
        /*byte x = 5;
        byte y = 10;
        long z = x + y;*/
        /*short x = 10;
        int y = 2 * x;*/
        /*java.util.List<Integer> list = new java.util.ArrayList<Integer>();
        list.add(10);
        list.add(14);
        for (int x : list) {
            System.out.print(x + ", ");
            break;
        }*/
        /*int x = 4;
        long y = x * 4 - x++;
        if (y < 10) System.out.println("Too Low");
        else  System.out.println("Just right");
         else  System.out.println("Too High");*/
        /*for (int i = 0; i < 10;) {
            System.out.println(i);
            i = i++;
            System.out.println(i);
            System.out.println("Hello World");
        }*/
        /*byte a = 40, b = 50;
        int sum = (byte) a + b;
         System.out.println(sum);*/
       /* int x1 = 50, x2 = 75;
         boolean b = x1 >= x2;
         if(b = true) System.out.println("Success");
         else System.out.println("Failure");*/
        int count = 0;
        ROW_LOOP:
        for (int row = 1; row <= 3; row++)
            for (int col = 1; col <= 2; col++) {
                if (row * col % 2 == 0) continue ROW_LOOP;
                count++;
            }
        System.out.println(count);
    }
}
