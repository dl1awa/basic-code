package com.dl1_.ooppolymorphic.test4;

public class Dog extends Animal {
    public Dog(){

    }
    public Dog(String name, String color){
        super(name, color);
    }
    @Override
    public void eat() {
        System.out.println(getColor() + "的" + getName() + "在吃骨头");
    }

    public void work(){
        System.out.println(getColor()+"的"+getName()+"在看家");
    }
}
