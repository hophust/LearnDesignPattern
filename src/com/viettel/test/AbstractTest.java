package com.viettel.test;

public abstract class AbstractTest {
    public int getNum(){
        return 45;
    }
    public abstract class Bar{
        public int getNumb(){
            return 38;
        }
    }

    public static void main(String[] args) {
        AbstractTest abstractTest = new AbstractTest() {
            @Override
            public int getNum() {
                return 22;
            }
        };
        AbstractTest.Bar bar = abstractTest.new Bar() {
            @Override
            public int getNumb() {
                return 57;
            }
        };
        System.out.println(bar.getNumb() + "---" + abstractTest.getNum());
    }
}
