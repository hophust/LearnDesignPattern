package com.viettel.test.OPC11Part2.chuong7;

import java.util.concurrent.*;

public class CheckResultUsingSubmitMethod {
    private static int counter;
    public static void main(String[] unused) throws Exception{
        ExecutorService service=null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<?> result = service.submit(() -> {
                for (int i = 0; i < 500; i++) {
                    System.out.println(CheckResultUsingSubmitMethod.counter);
                    CheckResultUsingSubmitMethod.counter++;
                }
            });
            result.get(10, TimeUnit.MILLISECONDS);
            System.out.println("Reached");
        } catch (TimeoutException e) {
            System.out.println("Not reached");
        } finally {
            if(service != null){
                service.shutdown();
            }
        }
    }
}
