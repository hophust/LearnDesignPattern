package com.viettel.test.practice.de1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cau2 {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("NHAPMON","hung"));
        bookList.add(new Book("PTPMCN","vuong"));
        bookList.add(new Book("ABC","vuong"));
        bookList.add(new Book("CNWeb","mai"));
        Comparator<Book> bookComparator = (b1,b2)->b1.getGenre().compareTo(b2.getGenre());
        bookList.stream().sorted(bookComparator).forEach((Book book) -> System.out.println(book.getTitle() +"-" + book.getGenre()));
        System.out.println("-----------------------");
        bookList.stream().sorted(bookComparator.thenComparing(Book::getTitle)).forEach((Book book) -> System.out.println(book.getTitle() +"-" + book.getGenre()));
        System.out.println("-----------------------");
        for (Book book: bookList) {
            System.out.println(book.getTitle() +"-" + book.getGenre());
        }
    }
}
