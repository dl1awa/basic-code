package com.dl1_.ooppolymorphic.test4;

public class Cat extends Animal {
    public Cat(String name, String color) {
        super(name, color);
    }
    public Cat(){

    }

    @Override
    public void eat() {
        System.out.println(getColor() + "的" + getName() + "在吃鱼");
    }

    public void work(){
        System.out.println(getColor()+"的"+getName()+"在抓老鼠");
    }

}
