package com.viettel.designpattern.behavioral.state.sonkc;

public class AtDestination implements DeliveryState{
    @Override
    public void goNext(Delivery delivery) {	delivery.setState(new AtDestination());
    }
    @Override
    public String getLocation() {
        return "Final destination";
    }


}
