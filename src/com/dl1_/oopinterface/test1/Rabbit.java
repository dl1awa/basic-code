package com.dl1_.oopinterface.test1;

public class Rabbit extends Animal {
    public Rabbit() {

    }
    public Rabbit(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("兔子正在吃萝卜");
    }


}
