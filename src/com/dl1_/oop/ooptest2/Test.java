package com.dl1_.oop.ooptest2;

public class Test {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="张三";
        s1.age=18;
        s1.height=1.75;
        s1.gender="男";
        System.out.println(s1.name);
        System.out.println(s1.gender);
        System.out.println(s1.age);
        System.out.println(s1.height);


        Student s2=new Student();
        s2.name="李四";
        s2.age=19;
        s2.height=1.65;
        s2.gender="女";
        System.out.println(s2.name);
        System.out.println(s2.gender);
        System.out.println(s2.age);
        System.out.println(s2.height);
    }
}
