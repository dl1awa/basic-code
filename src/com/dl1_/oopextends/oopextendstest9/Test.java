package com.dl1_.oopextends.oopextendstest9;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18, "高一");
        System.out.println(s1.age+"岁的"+s1.name + "的年级是" + s1.grade);
        Teacher t1 = new Teacher("李四", 30, "数学");
        System.out.println(t1.age+"岁的"+t1.name + "的科目是" + t1.subject);
    }
}
