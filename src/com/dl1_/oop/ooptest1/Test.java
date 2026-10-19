package com.dl1_.oop.ooptest1;

public class Test {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.name="小白";
        d1.age=2;
        d1.weight=3.5;
        d1.color="白色";
        System.out.println(d1.name);
        System.out.println(d1.age);
        System.out.println(d1.weight);
        System.out.println(d1.color);


        Dog d2=new Dog();
        d2.name="大黄";
        d2.age=2;
        d2.weight=4.0;
        d2.color="黄色";
        System.out.println(d2.name);
        System.out.println(d2.age);
        System.out.println(d2.weight);
        System.out.println(d2.color);
    }
}
