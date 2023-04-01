package com.viettel.designpattern.behavioral.state.sonkc;

public interface DeliveryState {
    void goNext(Delivery delivery);
    String getLocation();

}
