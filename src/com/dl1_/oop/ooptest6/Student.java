package com.dl1_.oop.ooptest6;

public class Student {
    private String name;
    private int age;
    private int height;
    private int weight;

    public void setName(String a) {
        name = a;
    }
    public String getName() {
        return name;
    }
    public void setAge(int b) {
        age = b;
    }
    public int getAge() {
        return age;
    }
    public void setHeight(int h) {
        height = h;
    }
    public int getHeight() {
        return height;
    }
    public void setWeight(int w) {
        weight = w;
    }
    public int getWeight() {
        return weight;
    }
    public void study() {
        System.out.println(name + "正在努力学习");
    }
}
