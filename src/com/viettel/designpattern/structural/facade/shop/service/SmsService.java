package com.viettel.designpattern.structural.facade.shop.service;

public class SmsService {
    public void sendSMS(String mobilePhone) {
        System.out.println("Sending an mesage to " + mobilePhone);
    }
}
