package com.dl1_.test.oopextendstest2;

public class Lecturer extends Teacher {
    //构造方法
    public Lecturer() {
    }
    public Lecturer(int id, String name, String work) {
        super(id, name, work);
    }
    //方法
    @Override
    public void work() {
        System.out.println("我是" + getId() + "的" + getName() + "，我在负责"+getWork()+"的工作");
    }
}
