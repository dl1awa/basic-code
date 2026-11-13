package com.dl1_.oopextends.oopextendstest11;
// 硕士研究生
public class MasterStudent extends Student {
//构造方法
    public MasterStudent() {
        super();
    }
    public MasterStudent(String name, int age, String grade) {
        super(name, age,grade);
    }

    @Override
    public void study() {
        System.out.println(getAge() + "岁的" + getName() + "正在攻读硕士学位");
    }
    @Override
    public void sleep() {
        System.out.println(getAge() + "岁的" + getName() + "正在豪华版公寓睡觉");
    }
}
