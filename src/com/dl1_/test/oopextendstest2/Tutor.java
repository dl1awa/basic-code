package com.dl1_.test.oopextendstest2;

public class Tutor extends Teacher {
    public Tutor() {
    }
    public Tutor(int id, String name, String work) {
        super(id, name, work);
    }
    @Override
    public void work() {
        System.out.println("我是" + getId() + "的" + getName() + "，我在负责"+getWork()+"的工作");
    }
}
