package com.dl1_.oopinterface.test1;

public class Frog extends Animal implements Swim {
    public Frog() {

    }
    public Frog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("青蛙正在吃虫子");
    }
    @Override
    public void swim() {
        System.out.println("青蛙正在蛙泳");
    }
}
