package com.viettel.designpattern.creational.objectpool;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ClientThread implements Runnable{
    private TaxiPool taxiPool;

    public ClientThread(TaxiPool taxiPool) {
        this.taxiPool = taxiPool;
    }

    @Override
    public void run() {
        try {
            takeATaxi();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (TaxiNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void takeATaxi() throws InterruptedException, TaxiNotFoundException {
        System.out.println("New client: " + Thread.currentThread().getName());
        Taxi taxi = taxiPool.getTaxi();

        TimeUnit.MILLISECONDS.sleep(randInt(1000, 1500));

        taxiPool.release(taxi);
        System.out.println("Served the client: " + Thread.currentThread().getName());
    }

    public static int randInt(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min;
    }
}
