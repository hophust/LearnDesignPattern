package com.viettel.test.OCA.chuong4;

public class OrderDriver {
    public static void main(String[] args) {
        // bien va khoi static chi duoc goi lan dau tien khi lop duoc load
        System.out.print(Order.result + " ");
        System.out.print(Order.result + " ");
        new Order();
        new Order();
        System.out.print(Order.result + " ");
    }
}
