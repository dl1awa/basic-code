package com.dl1_.staticvariable.staticvariabletest1;

public class Test {
    public static void main(String[] args) {

        Student.teacherName = "小雯老师";

        Student s1 = new Student();
        s1.name = "小诗诗";
        s1.age = 19;
        s1.teacherName = "小雯老师";

        Student s2 = new Student();
        s2.name = "小丹丹";
        s2.age = 18;

        System.out.println(s1.name + " " + s1.age + " " + s1.teacherName);
        System.out.println(s2.name + " " + s2.age + " " + s2.teacherName);

        s2.teacherName = "阿伟老师";

        System.out.println(s1.name + " " + s1.age + " " + s1.teacherName);
        System.out.println(s2.name + " " + s2.age + " " + s2.teacherName);


    }
}
