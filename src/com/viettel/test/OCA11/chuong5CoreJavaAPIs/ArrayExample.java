package com.viettel.test.OCA11.chuong5CoreJavaAPIs;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String... args) {
        int[] t1 = new int[3];
        for (int t: t1) {
            System.out.println(t);
        }
        int epkieu = 5;
        long test = epkieu;
        short tes1 = (short) epkieu;

        String[] strings = { "stringValue" };
        Object[] objects = new Object[1];
        Object[] objects1 = strings;
        //String[] againStrings = (String[]) objects;
        //againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
        objects[0] = new StringBuilder("a"); // careful!
        System.out.println(objects[0]);

        String [] stringArray = {"hopnv9","hopnv"};
        System.out.println(stringArray.length);

        int[]arraySort = new int[] {6,3,9};
        Arrays.sort(arraySort);
        System.out.println(Arrays.toString(arraySort));
        for (int x: arraySort) {
            System.out.println(x);
        }

        String[] strings1 = { "10", "hopnv", "9", "100","THANG"};
        Arrays.sort(strings1);
        for (String string : strings1)
            System.out.println(string + " ");

        System.out.println("--------------------Search array-----------------");
        int[] searchArray = new int[] {1,3,3,5,7,9};
        System.out.println(Arrays.binarySearch(searchArray,3));
        System.out.println(Arrays.binarySearch(searchArray,5));
        System.out.println(Arrays.binarySearch(searchArray,2));
        System.out.println(Arrays.binarySearch(searchArray,6));
        System.out.println(Arrays.binarySearch(searchArray,11));
        System.out.println(Arrays.binarySearch(searchArray,13));
        System.out.println(Arrays.binarySearch(searchArray,19));
        System.out.println(Arrays.binarySearch(searchArray,25));

        System.out.println(Arrays.compare(new int[] {6,9}, new int[] {5,6,9}));

        System.out.println("------------------Mang 2 chieu ------------------");
        int array1D[];
        int[][] array2D;
        String[][] strings2 = new String[3][2];
        strings2[0][1] = "set";
        for (int i = 0; i < strings2.length; i++) {
            for (int j = 0; j < strings2[i].length; j++) {
                System.out.println(strings2[i][j] +"");
            }
            System.out.println();
        }


    }
}
