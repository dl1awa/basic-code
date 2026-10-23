package com.dl1_.oop.ooptest10;

public class Student {
    //定义一个Javabean类描述学生信息
    //属性：姓名  年龄
    //行为：学习  吃饭  睡觉
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void study() {
        System.out.println(name+"正在学习");
    }

    public void eat() {
        System.out.println(name+"正在吃饭");
    }

    public void sleep() {
        System.out.println(name+"正在睡觉");
    }
}
