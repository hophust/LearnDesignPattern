package com.viettel.designpattern.behavioral.state.sonkc;

public class OnRoute implements DeliveryState{
    @Override
    public void goNext(Delivery delivery) {
        delivery.setState(new AtDestination());
    }
    @Override
    public String getLocation() {
        return "On the train"; }

}
