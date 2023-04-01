package com.viettel.test.OCA11.chuong2;

public class ClientAccount {

    public void doesThisCompile ( boolean check){
        var question = 1;

    }
    public static void main(String[] args) {
        char test = 65;
        Character aChar = 65;
        Float aFloat = 6f;
        Double aDouble = 9d;
        Integer integer = 9;
        Number number = 5;
        Short aShort = 6;
        Byte aByte = 7;
        Long aLong = 9L;
        /*Account account = new Account();
        account.open();
        System.out.println("Gia tri mac dinh kieu char: " + account.charTypeDefaultValue);
        System.out.println(Account.classVariable);
        System.out.println(account.classVariable);*/
        Account account1 = new Account();
        if(account1 instanceof Account) {
            System.out.println("test account instanceof");
        }


    }
}
