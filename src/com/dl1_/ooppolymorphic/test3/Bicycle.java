package com.dl1_.ooppolymorphic.test3;

public class Bicycle extends Vehicle {
    public Bicycle(String brand, double speed) {
        super(brand, speed);
    }

    public Bicycle() {
    }

    @Override
    public void move() {
        System.out.println(getBrand()+"的自行车在以"+getSpeed()+"的速度移动");
    }

    public void ringBell() {
        System.out.println(getBrand()+"的自行车在响铃");
    }

    public void drive() {
        move();
        ringBell();
    }
}
