package com.viettel.designpattern.behavioral.state.sonkc;

public class Processing implements DeliveryState {
    @Override
    public void goNext(Delivery delivery) {
        delivery.setState(new OnRoute());
    }

    @Override
    public String getLocation() {
        return "Warehouse";
    }

}
