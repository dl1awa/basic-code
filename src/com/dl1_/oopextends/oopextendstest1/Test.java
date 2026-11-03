package com.dl1_.oopextends.oopextendstest1;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        Teacher t1 = new Teacher();
        s1.name = "张三";
        s1.age = 18;
        s1.grade = 9;
        s1.study();
        s1.eat();
        t1.name = "李四";
        t1.age = 30;
        t1.subject = "数学";
        t1.teach();
        t1.eat();
    }
}
