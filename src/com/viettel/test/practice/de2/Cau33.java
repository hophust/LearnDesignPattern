package com.viettel.test.practice.de2;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cau33 {
    static Path p1 = Paths.get("c:\\finance\\data\\reports\\daily");
    public static void main(String[] args) {
        System.out.println(p1.subpath(0,2));
        Map<String, List<Double>> groupedValues = new HashMap<>();
        //groupedValues.computeIfAbsent()
    }
}
