package com.viettel.test.dethinam2022.thang7;

public class Cau18 {

    public static String hidenPhone(String fullPhoneNumber){
        /*String mask = "xxx-xxx-";
        mask.append(fullPhoneNumber.substring(8));
        return mask; */
        //return new StringBuilder("xxx-xxx-")+fullPhoneNumber.substring(8);
        return new StringBuilder(fullPhoneNumber).replace(0, 8, "xxx-xxx-").toString();
        //return "xxx-xxx-"+fullPhoneNumber.substring(8, 12);

    }

    public static void main(String[] args) {
        System.out.println(hidenPhone("123456789012"));
    }
}

