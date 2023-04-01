package com.viettel.test.OCATest.chuong4;

import java.util.Arrays;
import java.util.List;

public class Mang1Chieu {
    public static void main(String[] args) {
        Object [] kieuDuLieuObject;
        Integer [] integers = {5,10,15};
        List<Integer> integers1 = Arrays.asList(integers);
        int iterSize = integers1.size();
        System.out.println(integers1);
        short [] arr;// khai bao mang chua chi ro so phan tu
        arr = new short[2];
        short arr1 [] = new short[2];// khai bao mang chi ro so phan tu
        short [] arr2 = new short[]{100, 100};// khai bao mang voi cac phần tử được gán giá trị cụ thể
        short [] arr3 = {3,6,5,2,1,4,8,9,7};
        arr[0] = 5;
        arr[1] = 10;
        System.out.println(arr.length);
        System.out.println("[" + arr[0] + ", " + arr[1] + "]");
        System.arraycopy(arr,0,arr1,0,2);
        System.out.println("[" + arr1[0] + ", " + arr1[1] + "]");
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.binarySearch(arr3,(short) 5));
        Arrays.sort(arr3);
        System.out.println(Arrays.binarySearch(arr3,(short) 5));
        for (short t: arr3) {
            System.out.print(t +" ");
        }
    }
}
