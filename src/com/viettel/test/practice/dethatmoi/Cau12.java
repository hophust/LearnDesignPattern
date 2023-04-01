package com.viettel.test.practice.dethatmoi;

import java.util.function.BiFunction;

public class Cau12<T> {
    final BiFunction<T, T, Boolean> validator;
    T left = null;
    T right = null;
    private Cau12(){
        validator = null;
    }
    Cau12(BiFunction<T,T,Boolean> v, T x, T y){
        validator = v;
    }

    void get(T x, T y){
        if(!validator.apply(x,y)) throw new IllegalArgumentException();
        setLeft(x);
        setRight(y);
    }
    void setLeft(T x){
        left = x;
    }
    void setRight(T y){
        right = y;
    }
    final boolean isValid(){
        return validator.apply(left,right);
    }

    public static void main(String[] args) {
        Cau12 cau12 = new Cau12();
        if((cau12 instanceof Cau12) && (cau12.isValid())){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
