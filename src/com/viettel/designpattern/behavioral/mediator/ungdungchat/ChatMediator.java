package com.viettel.designpattern.behavioral.mediator.ungdungchat;

public interface ChatMediator {
    void sendMessage(String msg, User user);

    void addUser(User user);
}
