package com.viettel.designpattern.behavioral.chainofresponse.ruttien;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}
