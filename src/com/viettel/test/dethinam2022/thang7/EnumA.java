package com.viettel.test.dethinam2022.thang7;

import java.io.Serializable;

interface I{}
public enum EnumA implements I, Serializable {A,AA,AAA};
class Cau19 {
    /*public enum EnumB(B, BB, BBB,
        public Object clone(){return B;}
    )*/
    public static enum EnumC{C,CC,CCC};
    //public static enum EnumD extends EnumC{DDD};

    /*public Cau19{
        System.out.println(EnumC.CC.index());
    }*/
    public static void main(String[] args) {
        System.out.println(EnumC.CC);
        System.out.println(EnumC.valueOf("CCC"));
        System.out.println(EnumC.CCC.name());

    }
}
