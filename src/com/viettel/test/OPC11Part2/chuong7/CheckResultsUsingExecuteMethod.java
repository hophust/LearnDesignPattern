package com.viettel.test.OPC11Part2.chuong7;

public class CheckResultsUsingExecuteMethod {
    private static int counter = 0;
    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                CheckResultsUsingExecuteMethod.counter ++;
            }
        }).start();
        while (CheckResultsUsingExecuteMethod.counter < 100){
            System.out.println(CheckResultsUsingExecuteMethod.counter);
            System.out.println("Not reach yet");
            Thread.sleep(1000);
        }
        System.out.println("Reach");
    }
}
