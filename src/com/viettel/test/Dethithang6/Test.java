package com.viettel.test.Dethithang6;

/*class Student {
    String name;
    int age;

    public Student() {
        this.name = "hopnv9";
        this.age = 28;
    }

    void Student() {
        name = "hopnv";
        age = 26;
    }

    void Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}*/
interface Printable{
    public void setMargin();
    public void setOrientation();
}

abstract class Paper implements Printable{
    public void setMargin(){}
}

class NewsPaper extends Paper{
    public void setMargin(){}
    public void setOrientation(){}
}
public class Test {

    /*private static void m(int x){
        System.out.println(x);
        System.out.println("int version");
    }

    private static void m(char x){
        System.out.println("char version");
    }*/

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder(100);
        //Student student = new Student();
        //student.setName("test");
        //student.setAge(30);
        //student.Student();
        //System.out.println(student.name + ":" + student.age);
        // Cau 3
        //String str = "java";
        //StringBuilder builder = new StringBuilder();
        /*int i = '5';
        m(i);
        m('5');*/
        /*int a = 5 - '0';
        System.out.println(a);  //-43
        Integer b = 5 - '0';
        System.out.println(b);  //-43
        System.out.println(Integer.valueOf(a)); //-43
        System.out.println(String.valueOf(b));  //-43*/




    }
}
