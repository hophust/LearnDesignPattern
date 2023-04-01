package com.viettel.test.OCATest.chuong8;

public class WhackAnException {
    public static void main(String... hammer) {
        try {
            throw new ClassCastException();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        } catch (Error e) {
            throw new NullPointerException();
        } finally {
            throw new RuntimeException();
        }
    }
}
