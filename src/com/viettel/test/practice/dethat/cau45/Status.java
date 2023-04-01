package com.viettel.test.practice.dethat.cau45;

public enum Status {
    BRONZE(5), SILVER(10), GOLD(15);
    private int rate;
    private Status(int rate){
        this.rate = rate;
    }
    public int getRade(){
        return rate;
    }
    /*public Status addStatus(int rate) {
        return new Status(20);
    }*/
}
