package com.viettel.test.OCATest.chuong8;

class CastleUnderSiegeException extends Exception {}
class KnightAttackingException extends CastleUnderSiegeException {}
public class Citadel {
    public void openDrawbridge() throws RuntimeException, CastleUnderSiegeException { // q1
        try {
            throw new KnightAttackingException();
        } catch (Exception e) {
            System.out.println("Test catch va finally cung throw 1 exception 1");
            throw new CastleUnderSiegeException();
        } finally {
            System.out.println("Test catch va finally cung throw 1 exception");
            throw new CastleUnderSiegeException(); // q2
        }
    }
    public static void main(String[] moat) throws CastleUnderSiegeException {
        new Citadel().openDrawbridge(); // q3
    }
}

