package com.viettel.designpattern.creational.singleton;

public class DoubleCheckLockingSingleton {
    private static volatile  DoubleCheckLockingSingleton instance;
    private DoubleCheckLockingSingleton(){}
    public static DoubleCheckLockingSingleton getInstance(){
        if(instance == null){
            // tang hieu suat, dong bo hoa ca 2 luong cung 1 luc
            // nhieu luong co the truy cap vao cac thong tin ma khong can phai duoc dong bo
            synchronized (DoubleCheckLockingSingleton.class){
                if(instance == null){
                    instance = new DoubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }
}
