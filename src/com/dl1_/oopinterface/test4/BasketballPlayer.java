package com.dl1_.oopinterface.test4;

public class BasketballPlayer extends Person {
    public BasketballPlayer() {

    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("篮球运动员学打篮球");
    }
}
