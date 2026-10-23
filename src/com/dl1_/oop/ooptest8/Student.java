package com.dl1_.oop.ooptest8;

public class Student {
    private String name;
    private int age;
    private int height;
    private int weight;

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
    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public void study() {
        System.out.println(this.name + "正在努力学习");
    }
}


