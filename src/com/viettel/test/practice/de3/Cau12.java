package com.viettel.test.practice.de3;

import java.util.concurrent.atomic.AtomicInteger;

public class Cau12 {
    static AtomicInteger ai = new AtomicInteger();

    public static void main(String[] args) {
        ai.addAndGet(1);
        ai.incrementAndGet();
    }
}
