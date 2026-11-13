package com.dl1_.oopextends.oopextendstest9;

public class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person带参构造执行，name=" + name + ", age=" + age);
    }
    public Person() {
        System.out.println("Person无参构造执行");
    }
}
