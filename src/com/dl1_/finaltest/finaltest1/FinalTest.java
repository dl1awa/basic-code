package com.dl1_.finaltest.finaltest1;

public class FinalTest {
    public static void main(String[] args) {
        final int number = 100;
        System.out.println("number = " + number);
        System.out.println(number+100);
        // 错误：final变量不能重新赋值
        // number =200;

        final Student s1 = new Student("张三", 18);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        s1.setName("李四");
        s1.setAge(20);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}
