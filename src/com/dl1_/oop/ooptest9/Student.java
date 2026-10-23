package com.dl1_.oop.ooptest9;

public class Student {
    private String name;
    private int age;
    private String sex;
    private int height;

    // 无参构造方法
    public Student() {
        System.out.println("无参构造方法");
    }

    // 有参构造方法
    public Student(String name, int age, String sex, int height) {
        System.out.println(name + age + sex + height);
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
    }

    //set/get
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
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void show(){
        System.out.println("姓名：" + name + "，年龄：" + age + "，性别：" + sex + "，身高：" + height);
    }
}
