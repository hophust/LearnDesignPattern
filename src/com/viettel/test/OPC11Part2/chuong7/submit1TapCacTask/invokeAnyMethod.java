package com.viettel.test.OPC11Part2.chuong7.submit1TapCacTask;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class invokeAnyMethod {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        System.out.println("begin");
        Callable<String> task = () -> "result";
        Callable<String> task1 = () -> "result1";
        Callable<String> task2 = () -> "result2";
        String data = service.invokeAny(List.of(task1,task2,task));
        System.out.println(data);
        System.out.println("end");
    }
}
