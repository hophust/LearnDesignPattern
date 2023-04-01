package com.viettel.test.practice.dethat;

abstract class Automobile {//line 1
    abstract void wheels();
}

public class Cau5 extends Automobile{
    //line 2
    void wheels () {      // line 3
        System.out.println(4);
    }
    public void main (String[] args){
        Automobile ob = new Cau5();     //line 4
        ob.wheels();
    }
}


