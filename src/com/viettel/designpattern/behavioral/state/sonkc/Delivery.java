package com.viettel.designpattern.behavioral.state.sonkc;

public class Delivery {
    private DeliveryState state = new Processing();
    public Delivery() {
        System.out.println(getCurrentLocation());
    }
    public void setState(DeliveryState state) {
        this.state = state;
    }
    public Delivery goNext() {
        state.goNext(this);
        System.out.println(getCurrentLocation());
        return this;
    }
    private String getCurrentLocation() {
        return state.getLocation();
    }

}
