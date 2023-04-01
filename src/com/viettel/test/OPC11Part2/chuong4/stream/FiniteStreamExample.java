package com.viettel.test.OPC11Part2.chuong4.stream;

import java.util.List;
import java.util.stream.Stream;

public class FiniteStreamExample {
    public static void main(String[] args) {
        Stream<String> empty = Stream.empty();
        Stream<Integer> singleElement = Stream.of(1);
        Stream<Integer> fromArray = Stream.of(1,2,3);
        var list = List.of("a","b","c");
        Stream<String> stringStream = list.stream();
        Stream<String> parallelStream = list.parallelStream();
    }
}
