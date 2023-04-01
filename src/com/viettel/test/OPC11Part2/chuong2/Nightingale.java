package com.viettel.test.OPC11Part2.chuong2;

import java.util.ArrayList;
import java.util.List;

class SongBird {
    @Deprecated static void sing(int volume) {}
    static Object chirp(List<String> data) { return data.size();
    }
}
public class Nightingale {
    public void wakeUp() {
        SongBird.sing(10);
    }
    public void goToBed() {
        SongBird.chirp(new ArrayList());
    }
    public static void main(String[] args) {
        var birdy = new Nightingale();
        birdy.wakeUp();
        birdy.goToBed();
    }
}

