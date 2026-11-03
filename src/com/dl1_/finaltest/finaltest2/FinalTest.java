package com.dl1_.finaltest.finaltest2;

public class FinalTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println(c1.getRadius());
        System.out.println(c1.getPi());
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        c1.setRadius(10);
        System.out.println(c1.getRadius());
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
    }
}
