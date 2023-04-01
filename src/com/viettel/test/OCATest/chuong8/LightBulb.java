package com.viettel.test.OCATest.chuong8;

interface Source {
    void flipSwitch() throws Exception;
}

public class LightBulb implements Source {
    public void flipSwitch() {
        try {
            throw new RuntimeException("Circuit Break!");
        } finally {
            System.out.print("Flipped!");
        }
    }

    public static void main(String... electricity) throws Throwable {
        final Source bulb = new LightBulb();
        bulb.flipSwitch();
    }
}

