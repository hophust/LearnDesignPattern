package com.viettel.test.OCATest.chuong8;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Printer {
    public void print() throws ArithmeticException{
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException exception) {
            System.out.print("Z");
        } catch (IOException enfe) {
            System.out.print("X");
        } finally {
            System.out.print("Y");
        }
    }
    public static void main(String... ink) {
        new Printer().print();
    }

}
