package com.dl1_.oopextends.oopextendstest11;

public class Student extends Person {
    private String grade;
//构造方法
    public Student() {
        super();
    }
    public Student(String name, int age,String grade) {
        super(name, age);
        this.grade = grade;
    }
//方法
    public void study() {
        System.out.println(getAge() + "岁的" + getName() + "正在学习");
    }

//set,get
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
}
