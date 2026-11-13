package com.dl1_.oopextends.oopextendstest11;

public class Person {
    private String name;
    private int age;
//构造方法
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person() {
    }
//方法
    public void eat() {
        System.out.println(age + "岁的" + name + "正在吃饭");
    }
    public void sleep() {
        System.out.println(age + "岁的" + name + "正在睡觉");
    }

//set,get
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
}
