package com.dl1_.ooppolymorphic.test4;

public abstract class Animal {
    private String name;
    private String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public Animal() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }


    public void drink(){
        System.out.println(getColor()+"的"+getName()+"在喝水");
    };
    public abstract void eat();

    public void behavior(Animal animal){
        animal.drink();
        animal.eat();
        if(animal instanceof Dog){
            ((Dog)animal).work();
        }else if(animal instanceof Cat){
            ((Cat)animal).work();
        }else{
            System.out.println("你选的动物不在范围内");
        }
    }

}
