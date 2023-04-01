package com.viettel.test.practice.dethat;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Cau10 {
    private int count = 0;
    public static void main(String[] args) {
        Cau10 cau10 = new Cau10();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executorService.submit(()->{
                for (int j = 0; j < 10000; j++) {
                    synchronized (cau10){
                        cau10.count++;
                    }
                }
            });
        }
        System.out.println(cau10.count);
        executorService.shutdown();
    }
}
