package com.viettel.test.OPC11Part2.chuong2;

public @interface Injured {
    String veterinarian() default "unassigned";
    String value() default "foot";
    int age() default 1;
}
