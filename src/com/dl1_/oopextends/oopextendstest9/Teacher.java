package com.dl1_.oopextends.oopextendstest9;

public class Teacher extends Person {
    String subject;
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
        System.out.println("Teacher带参构造执行，name=" + name + ", age=" + age + ", subject=" + subject);
    }
    public Teacher() {
        super();
        System.out.println("Teacher无参构造执行");
    }
}
