package com.dl1_.oopextends.oopextendstest10;

public class Student {
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //this()方法可以调用其他构造方法
    public Student() {
        this("同学",18);
    }
}
