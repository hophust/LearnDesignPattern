package com.viettel.test.practice.de3;

import java.util.List;
import java.util.stream.Stream;

class Book{
    private String tille;
    private String author;

    public Book(String tille, String author) {
        this.tille = tille;
        this.author = author;
    }

    public String getTille() {
        return tille;
    }

    public void setTille(String tille) {
        this.tille = tille;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
public class Cau37 {
    public static void main(String[] args) {
        var books = List.of(new Book("GT","hopnv9"),new Book("DS","toannv47"),new Book("XXTK","hopnv9"));
        long bookStream = books.stream().map(Book::getAuthor).distinct().count();
        System.out.println(bookStream);
    }
}
