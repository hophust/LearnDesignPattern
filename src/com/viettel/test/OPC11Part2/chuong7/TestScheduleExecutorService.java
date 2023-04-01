package com.viettel.test.OPC11Part2.chuong7;

import java.util.concurrent.*;

public class TestScheduleExecutorService {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        Callable<String> task1 = () -> "Monkey";
        Runnable task2 = () -> System.out.println("Hello zoo");
        ScheduledFuture<?> r1 = service.schedule(task1,10, TimeUnit.SECONDS);
        ScheduledFuture<?> r2 = service.schedule(task2,3,TimeUnit.SECONDS);
    }
}
