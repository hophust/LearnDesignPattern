package com.viettel.test.OCATest.chuong9;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List frisbees = new ArrayList();
        //StringBuilder sb = new StringBuilder("radical").insert(sb.length(), "robots");
        //System.out.println(sb);

        //String test = "123";
        //System.out.println(test.toString());

        String teams = new String("694");
        teams.concat(" 1155");
        teams.concat(" 2265");
        teams.concat(" 2869");
        System.out.println(teams);
        StringBuilder sb = new StringBuilder("radical ");
        sb.delete(1,5);
        System.out.println(sb);

        System.out.println("---------------------");
        StringBuilder sb1 = new StringBuilder();
        sb1.append("red");
        sb1.deleteCharAt(0);
        sb1.delete(1, 100);
        System.out.println(sb1);

        System.out.println("---------------------");
        String happy = " :) - (: ";
        System.out.println(happy);
        String really = happy.trim();
        System.out.println(really);
        String question = happy.substring(1, happy.length() - 1);
        System.out.println(question);
        System.out.println(really.equals(question));

    }
}
