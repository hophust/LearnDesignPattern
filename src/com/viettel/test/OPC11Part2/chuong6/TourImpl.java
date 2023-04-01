package com.viettel.test.OPC11Part2.chuong6;

// Service provider
public class TourImpl implements Tour {
    public String name() {
        return "Behind the Scenes";
    }
    public int length() {
        return 120;
    }
    public Souvenir getSouvenir() {
        Souvenir gift = new Souvenir();
        gift.setDescription("stuffed animal");
        return gift;
    }
}
