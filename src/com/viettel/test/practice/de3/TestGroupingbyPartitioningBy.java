package com.viettel.test.practice.de3;

import java.util.*;
import java.util.stream.Collectors;

class Book2 {
    private Integer id;
    private String title;
    private Integer cagegoryId;

    public Book2(Integer id, String title, Integer cagegoryId) {
        super();
        this.id = id;
        this.title = title;
        this.cagegoryId = cagegoryId;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getCagegoryId() {
        return cagegoryId;
    }

    @Override
    public String toString() {
        return "Book2 [id=" + id + ", title=" + title + ", cagegoryId=" + cagegoryId + "]";
    }

}
public class TestGroupingbyPartitioningBy {
    public static void main(String[] args) {
        List<Book2> books = Arrays.asList( //
                new Book2(1, "A", 1), //
                new Book2(2, "B", 1), //
                new Book2(3, "C", 2), //
                new Book2(4, "D", 3), //
                new Book2(5, "E", 1) //
        );
        Map<Integer, Set<Book2>> result = books.stream().collect(Collectors.groupingBy(Book2::getCagegoryId,Collectors.toSet()));
        result.forEach((k,v)-> System.out.println(k +"-"+v));

        List<String> list = Arrays.asList("Java", "C++", "C#", "PHP");
        Optional<String> optionalS = list.stream().collect(Collectors.maxBy(Comparator.naturalOrder()));
        System.out.println(optionalS.get());
    }
}
