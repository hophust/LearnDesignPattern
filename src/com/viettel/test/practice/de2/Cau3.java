package com.viettel.test.practice.de2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cau3 {
    public static void main(String[] args) {
        //DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/yy");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/yy");
        System.out.println(dateTimeFormatter.format(LocalDate.now()));
    }
}
