package com.dl1_.ooppolymorphic.test3;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("张三", 18, "男");
        Car c = new Car("奔驰", 100);
        Bicycle b = new Bicycle("崔克", 10);
        p.drive(c);
        p.drive(b);
    }

}
