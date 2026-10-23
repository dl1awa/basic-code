package com.dl1_.oop.ooptest10;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("张三",18);
        System.out.println("姓名："+s.getName()+" 年龄："+s.getAge());
        s.study();
        s.eat();
        s.sleep();
    }
}
