package com.viettel.test.OPC11Part2.chuong2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
@Target(ElementType.TYPE_USE)
@interface Technical {
}
public class NetworkRepair {
    class OutSr extends @Technical NetworkRepair {}
    public void repair(){
        var repairSubclass = new @Technical NetworkRepair();
        int remaining = (@Technical int) 10.0;
    }
}
