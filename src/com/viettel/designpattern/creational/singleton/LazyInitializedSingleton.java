package com.viettel.designpattern.creational.singleton;

//tiet kiem bo nho nhung khong hoat dong dung trong truong hop co nhieu luong
public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;
    private LazyInitializedSingleton(){};
    public static LazyInitializedSingleton getInstance(){
        if(instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
