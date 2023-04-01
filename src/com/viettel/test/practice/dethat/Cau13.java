package com.viettel.test.practice.dethat;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Cau13 {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(15);
        CyclicBarrier barrier = new CyclicBarrier(2,()-> System.out.println(list));
        IntStream.range(0,6).forEach(n->executorService.execute(()->{
            try {
                list.add(n);
                barrier.await();
            } catch (Exception e) {
                System.out.println("Exception");
            }
        }));
        executorService.shutdown();
    }
}
