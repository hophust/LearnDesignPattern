package com.viettel.designpattern.structural.facade.service;

public class EmailService {
    public void sendMail(String mailTo) {
        System.out.println("Sending an email to " + mailTo);
    }
}
