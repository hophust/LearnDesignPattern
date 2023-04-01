package com.viettel.test.OCATest.chuong7;
interface Horn { public Short play(); }
abstract class Woodwind { public Short play() {return 3;} }
public class Saxophone extends Woodwind implements Horn {
    /*public Short play() {
        return null;
    }*/
}
