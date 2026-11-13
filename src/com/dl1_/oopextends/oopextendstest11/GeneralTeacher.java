package com.dl1_.oopextends.oopextendstest11;
// 通识课教师
public class GeneralTeacher extends Teacher {
//构造方法
    public GeneralTeacher() {
        super();
    }
    public GeneralTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println(getAge() + "岁的" + getName() + "正在教通识课知识");
    }
}
