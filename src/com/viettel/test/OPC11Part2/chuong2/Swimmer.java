package com.viettel.test.OPC11Part2.chuong2;

public @interface Swimmer {
    int armLength =10;
    String stroke();
    String name();
    String favoriteStroke() default "Backstroke";
}
