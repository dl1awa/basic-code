package com.dl1_.finaltest.finaltest2;

public class Circle {
    private double radius;
    private final double pi = 3.14;

    //构造方法
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    //get/set方法
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPi() {
        return pi;
    }

    //方法
    public double area() {
        return pi * radius * radius;
    }

    public double perimeter() {
        return 2 * pi * radius;
    }
}
