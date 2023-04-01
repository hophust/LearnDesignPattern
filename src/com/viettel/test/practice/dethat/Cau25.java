package com.viettel.test.practice.dethat;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cau25 {
    public static void main(String[] args) {
        List<String> drawing = List.of("border","outline","accent","limit");
        Comparator<String> c1 = (a,b) -> b.compareTo(a);
        Comparator<String> c2 = c1.reversed();
        String strDrawing = drawing.stream().sorted(c2).collect(Collectors.joining(" "));
        System.out.println(strDrawing);
    }
}
