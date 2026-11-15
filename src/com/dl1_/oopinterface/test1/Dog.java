package com.dl1_.oopinterface.test1;

public class Dog extends Animal implements Swim{
    public Dog() {

    }
    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("狗正在吃骨头");
    }
    @Override
    public void swim() {
        System.out.println("狗正在狗刨");
    }
}
