package com.viettel.test.OPC11Part2.chuong3;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String, String> stringHashMap = Map.ofEntries(
                Map.entry("1", "hopnv"),
                Map.entry("2","thaolt"));
        for (String key: stringHashMap.keySet()) {
            System.out.println(key);
        }
    }
}
