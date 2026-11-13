package com.dl1_.oopextends.oopextendstest9;

public class Student extends Person {
    String grade;
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        System.out.println("Student带参构造执行，name=" + name + ", age=" + age + ", grade=" + grade);
    }
    public Student() {
        super();
        System.out.println("Student无参构造执行");
    }
}
