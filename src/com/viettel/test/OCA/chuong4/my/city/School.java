package com.viettel.test.OCA.chuong4.my.city;

import com.viettel.test.OCA.chuong4.my.school.Classroom;

public class School {
    public static void main(String[] args) {
        Classroom classrooM = new Classroom("ban nhua","ghe nhua");
        System.out.println(classrooM.getBan());
        classrooM.setBan("ban go");
        System.out.println(classrooM.getBan());
        //System.out.println(Classroom.globalKey);
        //Classroom room = new Classroom(101, ""Mrs. Anderson");
               // System.out.println(room.roomNumber);
         //System.out.println(room.floor);
         //System.out.println(room.teacherName); }
    }
}
