package com.viettel.test.OCATest.chuong8;
class PrintException extends Exception {}
class PaperPrintException extends PrintException {}
public interface Printer1 {
    abstract int printData() throws PrintException;
}
class Printer2 implements Printer1{

    @Override
    public int printData() throws PaperPrintException{
        return 0;
    }
}

