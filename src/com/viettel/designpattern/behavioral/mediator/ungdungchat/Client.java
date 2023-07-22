package com.viettel.designpattern.behavioral.mediator.ungdungchat;

public class Client {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl("DAC Group");

        User admin = new UserImpl(mediator, "Admin");
        User user1 = new UserImpl(mediator, "Thao");
        User user2 = new UserImpl(mediator, "Uyên");
        User user3 = new UserImpl(mediator, "Toàn");
        User user4 = new UserImpl(mediator, "Tuấn Anh");
        User user5 = new UserImpl(mediator, "Long");

        mediator.addUser(admin);
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        mediator.addUser(user5);

        admin.send("DAC sẽ đi du lịch vào ngày 12/8");
    }
}
