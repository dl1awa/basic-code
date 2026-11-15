package com.dl1_.oopinterface.test2;

public class Student implements Inter {
    String name;

    @Override
    public void method() {
        System.out.println("我是" + name);
    }


}
