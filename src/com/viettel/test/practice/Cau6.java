package com.viettel.test.practice;

import java.util.ArrayList;
import java.util.List;

class Course implements Comparable<Object>{
    private String categrory;
    public void printPassPercent(){
        System.out.println("8");
    }

    public String getCategrory() {
        return categrory;
    }

    public void setCategrory(String categrory) {
        this.categrory = categrory;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
public class Cau6 {
    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<>();
        Course course = new Course();
        course.setCategrory("Java");
        courseList.add(course);
        String testCategory="Java";
        Integer comparisonCode =1;
        long l = courseList.stream().peek(Course::printPassPercent).map(c->testCategory.compareToIgnoreCase(c.getCategrory())).filter(comparisonCode::equals).count();
        System.out.println(l);
    }
}
