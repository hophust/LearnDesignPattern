package com.viettel.test.OPC11Part2.chuong7.threadsafe;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollection {
    public static void main(String[] args) {
        var foodData = new ConcurrentHashMap<String, Integer>();
        foodData.put("apple",1);
        foodData.put("xoai",2);
        for (String key: foodData.keySet()) {
            foodData.remove(key);
        }
    }
}
