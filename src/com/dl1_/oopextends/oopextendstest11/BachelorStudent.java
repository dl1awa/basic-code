package com.dl1_.oopextends.oopextendstest11;
// 本科生
public class BachelorStudent extends Student {
//构造方法
    public BachelorStudent() {
        super();
    }
    public BachelorStudent(String name, int age, String grade) {
        super(name, age,grade);
    }

    @Override
    public void study() {
        System.out.println(getAge() + "岁的" + getName() + "正在攻读学士学位");
    }
}
