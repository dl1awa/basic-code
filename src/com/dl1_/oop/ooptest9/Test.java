package com.dl1_.oop.ooptest9;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18, "男", 180);
        Student s2 = new Student();

        s1.show();
        s1 = new Student("李四", 19, "女", 170);
        s1.show();
        System.out.println("名字：" + s1.getName() + "，年龄：" + s1.getAge()+"，性别："+s1.getSex()+"，身高："+s1.getHeight());
        s1.setAge(20);
        s1.show();
    }
}
