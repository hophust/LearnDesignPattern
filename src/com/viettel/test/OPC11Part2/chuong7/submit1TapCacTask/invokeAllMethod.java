package com.viettel.test.OPC11Part2.chuong7.submit1TapCacTask;

import java.util.List;
import java.util.concurrent.*;

public class invokeAllMethod {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        System.out.println("begin");
        Callable<String> task = () -> "result";
        List<Future<String>> list = service.invokeAll(List.of(task, task, task));
        for (Future<String> futrue: list) {
            System.out.println(futrue.get());
        }
        System.out.println("end");
    }
}
