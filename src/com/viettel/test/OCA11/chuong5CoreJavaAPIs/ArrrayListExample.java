package com.viettel.test.OCA11.chuong5CoreJavaAPIs;

import com.viettel.test.Dethithang5.A;

import java.util.ArrayList;
import java.util.List;

public class ArrrayListExample {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        ArrayList list1 = new ArrayList(1);
        ArrayList list2 = new ArrayList(list1);
        ArrayList<String> strings = new ArrayList<String>();
        ArrayList<String> strings1 = new ArrayList<>();
        var string2 = new ArrayList<String>();
        var string3 = new ArrayList<>();
        string3.add("1");
        string3.add("5");
        string3.add(2);
        for (Object o: string3) {
            System.out.println(o +"-");
        }

        int primitive = 5;
        ArrayList addExample = new ArrayList();
        addExample.add(1);
        addExample.add(3.5f);
        addExample.add(primitive);

        ArrayList<String> addExample1 = new ArrayList();
        Character character = Character.valueOf('c');
        System.out.println(character);
        int test = Integer.parseInt("5");

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(null);
        integers.add(2);
        System.out.println(integers);


    }
}
