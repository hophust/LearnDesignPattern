package com.viettel.test.dethinam2022.thang9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cau2 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Comparator<Book> c1 = (b1, b2)->b1.getGenre().compareTo(b2.getGenre()); //1
        books.stream().sorted(c1.thenComparing(Book::getTitle)); //2
        System.out.println(books);
    }
}
