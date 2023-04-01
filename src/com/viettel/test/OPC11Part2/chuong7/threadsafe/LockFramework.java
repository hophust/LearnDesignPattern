package com.viettel.test.OPC11Part2.chuong7.threadsafe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockFramework {
    public static void printMessage(Lock lock){
        try {
            lock.lock();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Thread(() -> printMessage(lock)).start();
        if(lock.tryLock()){
            try {
                System.out.println("Lock abtained, entering protected code");
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("Unable to acquire lock");
        }
    }
}
