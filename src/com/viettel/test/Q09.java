package com.viettel.test;

public class Q09 {
    public static void main(String[] args) {
        String[] numbers = {"Hop","Nguyen","Van"};
        for(String number: numbers) {
            switch (number) {
                case "Hop":
                    System.out.println("Hop");
                    break;
                case "Nguyen":
                    System.out.println("Nguyen");
                    break;
                case "Van":
                    System.out.println("Van");
                    break;
                default:
                    System.out.println("none");
            }
        }
    }
}
