package com.viettel.test.OCATest.chuong8;

public class Address {
    public String getAddress(String street, String city) {
        try {
            return street.toString() + " : " + city.toString();
        } finally {
            System.out.print("Posted:");
        }
    }

    public static void main(String[] form) {
        /*String street = "350 5th Ave";
        String city = "New York";*/
        String street = null;
        String city = null;
        System.out.print(new Address().getAddress(street, city));
    }
}

