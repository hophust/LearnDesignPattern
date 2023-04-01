package com.viettel.test.OPC11Part2.chuong2;

import java.lang.annotation.Repeatable;

@Repeatable(Risks.class)
public @interface Risk {
    String danger();
    int level() default 1;
}
