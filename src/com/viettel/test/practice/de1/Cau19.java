package com.viettel.test.practice.de1;

import java.util.Set;

public class Cau19 {
    public static void main(String[] args) {
        for (var x : System.getProperties().entrySet()) {
            var m = x.getKey();
        }
        for(var x:System.getProperties().keySet()) {
            System.out.println(x);
        }

    }
}
