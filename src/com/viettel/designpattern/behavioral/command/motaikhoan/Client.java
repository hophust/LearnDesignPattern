package com.viettel.designpattern.behavioral.command.motaikhoan;

public class Client {
    public static void main(String[] args) {
        Account account = new Account("gpcoder");

        Command open = new OpenAccount(account);
        Command close = new CloseAccount(account);
        BankApp bankApp = new BankApp(open, close);

        bankApp.clickOpenAccount();
        //bankApp.clickCloseAccount();
    }
}
