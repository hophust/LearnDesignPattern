package com.viettel.test.OCA.chuong4.my.school;

public class Classroom {
    /*private int roomNumber;
    protected String teacherName;
    static int globalKey = 54321;
    public int floor = 3;

    Classroom(int r, String t) {
        roomNumber = r;
        teacherName = t;
    }*/
    private String ban;
    private String ghe;

    public Classroom(String ban, String ghe) {
        this.ban = "Ban inox";
        this.ghe = "Ghe inox";
        //this.ban = ban;
        //this.ghe = ghe;
    }

    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
    }

    public String getGhe() {
        return ghe;
    }

    public void setGhe(String ghe) {
        this.ghe = ghe;
    }
}
