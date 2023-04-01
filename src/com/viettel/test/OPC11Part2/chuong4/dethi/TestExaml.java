package com.viettel.test.OPC11Part2.chuong4.dethi;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestExaml {
    public static void processList(ArrayList<Data> dataList, Process p){
        for(Data d: dataList){
            p.process(d.value, d.value);
        }
    }
    public static void main(String[] args) {
        /*List<Student> slist = Arrays.asList(new Student("S1", 40), new Student("S2", 35), new Student("S3", 30));
        Consumer<Student> increaseMarks = s -> s.addMarks(10);
        slist.forEach(increaseMarks);
        //slist.forEach(Student::debug);
        slist.stream().forEach(Student::debug);*/

        /*Book b1 = new Book("Java in 24 hrs", 30.0);
        Book b2 = new Book("Thinking in Java", null);
        Supplier s1 = b1::getPrice;
        System.out.println(b1.getTitle() + " " + s1.get());
        Supplier s2 = b2::getPrice;
        System.out.println(b2.getTitle() + " " + s2.getAsDouble());*/
        /*Stream<String> empty = Stream.empty();
        Stream<Integer> singleElement = Stream.of(1,2,3);
        var list = List.of("a","b","c");
        Stream<String> fromList = list.stream();
        Stream<String> fromListD = List.of("a","b").stream();*/
        /*List<Integer> al = Arrays.asList(100, 200, 230, 291, 43);
        System.out.println(al.stream().filter((i)->i<200).count());*/
        /*Stream<List<String>> s1 = Stream.of(
                Arrays.asList("a", "b"),
                Arrays.asList("a", "c")
        );

        Stream<String> news = s1.filter(s->s.contains("c"))
                .flatMap(olds -> olds.stream());
        news.forEach(System.out::print);*/
        /*List<String> values = Arrays.asList("Java EE", "C#", "Python");
        boolean flag = values.stream().allMatch(str->{
            System.out.println("Testing: "+str);
            return str.equals("Java");
        });
        System.out.println(flag);*/
        /*List<String> strList = Arrays.asList("a", "aa", "aaa");
        Function<String, Integer> f = x->x.length();
        Consumer<Integer> c = x->System.out.print("Len:"+x+" ");
        Predicate<String> p = x->"".equals(x);
        strList.forEach(p);*/
        //List<Integer> ls = Arrays.asList(11, 22, 33);
        //Function func = x->x+10;
        //UnaryOperator func = x->x+10;
        //UnaryOperator func = x->x+10;
        //Consumer func = x->x+10;
        /*Operator func = x->x+10;
        ls.replaceAll(func);
        System.out.println(ls);*/
        /*List<Student> ls = Arrays.asList(new Student("S1", Student.Grade.A), new Student("S2", Student.Grade.A), new Student("S3", Student.Grade.C));

        Map<Student.Grade, List<String>> grouping = ls.stream().collect(
                Collectors.groupingBy(Student::getGrade,
                        Collectors.mapping(Student::getName, Collectors.toList())));
        System.out.println(grouping);*/
        /*Function<Integer, MyProcessor> f = MyProcessor::new;
        MyProcessor mp = f.apply(10);
        mp.process();*/
        List<Integer> ls = Arrays.asList(11, 11, 22, 33, 33, 55, 66);
        System.out.println( ls.stream().distinct().anyMatch(x->x==11));
    }
}
