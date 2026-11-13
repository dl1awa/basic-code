package com.dl1_.oopextends.oopextendstest11;

public class Teacher extends Person {
//构造方法
    public Teacher() {
        super();
    }
    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println(getName() + "正在教学");
    }
}
