package com.dl1_.ooppolymorphic.test3;

public class Car extends Vehicle {
    public Car(String brand, double speed) {
        super(brand, speed);
    }

    public Car() {
    }

    @Override
    public void move() {
        System.out.println(getBrand()+"的汽车在以"+getSpeed()+"的速度移动");
    }

    public void honk() {
        System.out.println(getBrand()+"的汽车在鸣笛");
    }

    public void drive() {
        move();
        honk();
    }
}
